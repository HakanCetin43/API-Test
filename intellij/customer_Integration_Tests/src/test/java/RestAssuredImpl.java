import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
public class RestAssuredImpl {

    @Test
    public void get(){
        Response response = RestAssured.get("https://reqres.in/api/users/2");
        int statusCode = response.getStatusCode();
        System.out.println("statusCode = " + statusCode);
        String last_name = response.getBody().jsonPath().get("data.last_name").toString();
        System.out.println("last_name = " + last_name);
    }
    @Test
    public void getWithQueryParam(){
        given()
                .with()
                .contentType(ContentType.JSON)
                .param("page","2")
                .when()
                .get("https://reqres.in/api/users")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void getWithParam(){
        given()
                .with()
                .contentType(ContentType.JSON)
                .param("id", "2")
         .when()
                .get("https://reqres.in/api/users")
         .then()
//                .statusCode(200)
//                .log().body()
                .body("data.first_name", equalTo("Janet"));
    }

    @Test
    public void get0(){
        given()
                .get("https://reqres.in/api/users")
        .then()
                .body("data.first_name",hasItems("Eve","Emma","Charles"))
                .body("data.first_name[0]",equalTo("George"));
    }


}





