package testApi2;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestCase02 {

    @Test
    public void test01(){
       Response response = RestAssured.get("https://reqres.in/api/users?page=2");
       System.out.println("response.statusCode= " + response.statusCode());
       response.getStatusCode();
        System.out.println("response.getStatusCode() = " + response.getStatusCode());
       response.getBody().asString();
        System.out.println("response.getBody().asString() = " + response.getBody().asString());
       response.getContentType();
        System.out.println("response.getContentType() = " + response.getContentType());
        response.getBody().prettyPrint();
        System.out.println(" response.getBody().prettyPrint() = " +  response.getBody().prettyPrint());

   }
   @Test
   public void test02(){
        given()
                .contentType(ContentType.JSON)
        .when()
                .get("https://reqres.in/api/users?page=2")
        .then()
                .statusCode(200);



   }
}
