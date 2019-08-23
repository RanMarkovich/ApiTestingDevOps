import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class UserRegistration {

    public UserRegistration() throws IOException {

    UserInfo userInfo = new UserInfo();
    User user = new User();
    String postUrl = "http://localhost:3000/user";
    Gson gson = new Gson();
    HttpClient httpClient = HttpClientBuilder.create().build();
    HttpPost post = new HttpPost(postUrl);
    StringEntity postUser = new StringEntity(gson.toJson(user));


        post.setEntity(postUser);
        post.setHeader("Content-type", "application/json");
        HttpResponse response = httpClient.execute(post);
    }
}
