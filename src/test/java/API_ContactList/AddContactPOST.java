package API_ContactList;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.baseURI;

public class AddContactPOST {


    public static void main(String[] args) {

        baseURI = "https://thinking-tester-contact-list.herokuapp.com/";
        String bearerToken=SimpleLoginPOST.getToken();


        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(PayLoad.addContact())
                . header("Authorization", "Bearer " + bearerToken)
                .when()
                .post("contacts")
                .then()
                .statusCode(201)
                .log().all();

    }

}
