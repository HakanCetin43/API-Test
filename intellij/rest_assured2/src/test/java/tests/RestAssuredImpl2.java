package tests;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;
import static io.restassured.matcher. RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class RestAssuredImpl2 {
    Response response;

    @Test
    public void get(){
        Response response = RestAssured.get("http://reqres.in/api/users/2");
        int statusCode = response.getStatusCode();
        System.out.println("statusCode = " + statusCode);
        String last_name = response.getBody().jsonPath().get("data.last_name").toString();
        System.out.println("last_name = " + last_name);

    }
    @Test
    public void get2() {
        given()
                .with()
                .contentType(ContentType.JSON)
        .when()
                .get("http://reqres.in/api/users/2")
        .then()
                .body("data.last_name", is("Weaver"))
                .statusCode(200);


    }
}
