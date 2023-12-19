package API_ContactList;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class SimpleLoginPOST {

static String requestBody= "{\"email\": \"hansmueller@gmail.com\", \"password\": \"hansmuller\"}";
    public static void main(String[] args) {

        baseURI = "https://thinking-tester-contact-list.herokuapp.com/";


        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("users/login")
                .then()
                .statusCode(200)
                .log().all();

    }


    public static String getToken(){
        String token = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("users/login")
                .then()
                .statusCode(200)
                .extract().path("token");


        System.out.println("Token: " + token);
        return token;
    }



}
