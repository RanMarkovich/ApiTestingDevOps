package ApiTestingTests;

import ApiTestingClasses.Posts;
import ApiTestngClassesAdvanced.Info;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

public class JsonServerTesting {

   //@Test
    public void Test_01(){
       Response response = given().
                when().
                get("http://localhost:3000/posts");
       System.out.println("Get response is: " + response.asString());
    }

   // @Test
    public void Test_02(){
        Posts posts = new Posts();
        posts.setId(300733763);
        posts.setTitle("ran's title");
        posts.setAuthor("ran markovich");

        Response response = given().
                when().
                contentType(ContentType.JSON).
                body(posts).
                post("http://localhost:3000/posts/");

        System.out.println("response is: " + response.asString());
    }

    //@Test
    public void Test_03(){
        Response response = given().
                body("{\"title\":\"Updated title by PATCH request\"}").
                when().contentType(ContentType.JSON).
                patch("http://localhost:3000/posts/300733763");

        System.out.println("PATCH response is: " + response.asString());

    }

    //@Test
    public void Test_04(){
        delete("http://localhost:3000/posts/300733763");
    }

    @Test
    public void Test_05(){
        Info info0 = new Info();
        info0.setEmail("test_0@email.com");
        info0.setPhone("050-0000000");
        info0.setAddress("address line_0");

        Info info1 = new Info();
        info1.setEmail("test_1@email.com");
        info1.setPhone("050-1111111");
        info1.setAddress("address line_1");

        ApiTestngClassesAdvanced.Posts posts = new ApiTestngClassesAdvanced.Posts();
        posts.setId(2);
        posts.setTitle("title2");
        posts.setAuthor("author2");
        posts.setInfo(new Info[]{info0,info1});

        Response response = given().when().contentType(ContentType.JSON).
                body(posts).post("http://localhost:3000/posts");

        System.out.println("Response is: " + response.asString());
    }
}
