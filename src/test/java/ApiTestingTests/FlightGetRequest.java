package ApiTestingTests;

import com.jayway.restassured.response.Response;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;

public class FlightGetRequest {

    @Test
    public void Test_01() throws UnirestException {
        /*HttpResponse<String> response = Unirest.get("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/autosuggest/v1.0/UK/GBP/en-GB/?query=Stockholm")
                .header("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com")
                .header("x-rapidapi-key", "eb531ec5c5mshe5a93f76691e9a9p176f66jsn69462b409df3")
                .asString();

        System.out.println("response is: " + response);*/

        /*Response response = given().
                param("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com").
                param("x-rapidapi-key", "eb531ec5c5mshe5a93f76691e9a9p176f66jsn69462b409df3").
                when().
                get("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/autosuggest/v1.0/UK/GBP/en-GB/?query=Stockholm");

        System.out.println("response is: " + response.asString());*/
    }
}
