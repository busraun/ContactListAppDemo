package API_ContactList;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;

public class ListContactGET {

    public static void main(String[] args) {

        baseURI = "https://thinking-tester-contact-list.herokuapp.com/";
        String bearerToken=SimpleLoginPOST.getToken();


        String endpoint = "contacts/65888b40e7371f00131ade8c";

        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + bearerToken)
                .when()
                .get(endpoint);


        System.out.println("Status Code: " + response.getStatusCode());


        System.out.println("Response Body: " + response.getBody().asString());
    }


}
