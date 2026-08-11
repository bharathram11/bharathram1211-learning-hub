package com.bharath.qa.api.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BookingApiTest {
    @BeforeClass
    public void configureApi() {
        io.restassured.RestAssured.baseURI = "https://restful-booker.herokuapp.com";
    }

    @Test(description = "Creates a booking and validates the response payload")
    public void shouldCreateBooking() {
        String requestBody = """
                {
                  \"firstname\": \"Bharath\",
                  \"lastname\": \"QA\",
                  \"totalprice\": 150,
                  \"depositpaid\": true,
                  \"bookingdates\": {\"checkin\": \"2026-08-11\", \"checkout\": \"2026-08-12\"},
                  \"additionalneeds\": \"Automation testing\"
                }
                """;

        given()
            .contentType(ContentType.JSON)
            .body(requestBody)
        .when()
            .post("/booking")
        .then()
            .statusCode(200)
            .body("bookingid", notNullValue())
            .body("booking.firstname", equalTo("Bharath"))
            .body("booking.depositpaid", equalTo(true));
    }

    @Test(description = "Validates a negative API scenario for an unavailable booking")
    public void shouldReturnNotFoundForUnknownBooking() {
        given()
        .when()
            .get("/booking/999999999")
        .then()
            .statusCode(404);
    }
}
