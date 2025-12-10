package ru.praktikum.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import ru.praktikum.apimodels.User;
import ru.praktikum.apimodels.CreateAdRequest;

import static io.restassured.RestAssured.given;

public class ApiClient {

    private static final String BASE_URL = "https://qa-desk.stand.praktikum-services.ru/";

    protected RequestSpecification getSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setContentType(ContentType.JSON)
                .build();
    }

    public Response registerUser(User user) {
        return given()
                .spec(getSpec())
                .body(user)
                .when()
                .post("/api/signup");
    }

    public Response loginUser(User user) {
        return given()
                .spec(getSpec())
                .body(user)
                .when()
                .post("/api/signin");
    }

    public Response createAd(String token, String title) {
        CreateAdRequest request = new CreateAdRequest(title);

        return given()
                .spec(getSpec())
                .header("Authorization", "Bearer " + token)
                .body(request)
                .when()
                .post("/api/ads");
    }
}