package API_ContactList;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;

public class UpdateDataPATCH {

    public static void main(String[] args) {

        baseURI = "https://thinking-tester-contact-list.herokuapp.com/";
        String bearerToken=SimpleLoginPOST.getToken();

        String endpoint = "65888b40e7371f00131ade8c";


        String requestBody = "{\"phone\": \"35696376\"}";



        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .header("Authorization", "Bearer " + bearerToken)
                .when()
                .patch(endpoint)
                .then()
                .statusCode(200)
                .log().all();


    }



}
