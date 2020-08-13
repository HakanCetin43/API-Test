package testApi;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestCase01 {
    @Test
    public void test01(){
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println("response.statusCode = " + response.statusCode());
        response.getStatusCode();
        System.out.println("response.getStatusCode() = " + response.getStatusCode());
        response.getBody().asString();
        System.out.println("response.getBody() = " + response.getBody().asString());
        response.getContentType();
        System.out.println(" response.getContentType() = " +  response.getContentType());
        response.getBody().prettyPrint();
        System.out.println(" response.getBody().prettyPrint() = " +  response.getBody().prettyPrint());
    }
    @Test
    public void test2(){
       given()
               .contentType(ContentType.JSON);
        when()
                .get("https://reqres.in/api/users?page=2")

        .then()
            .statusCode(200);



    }
}
