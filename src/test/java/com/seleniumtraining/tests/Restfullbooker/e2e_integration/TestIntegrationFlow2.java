package com.seleniumtraining.tests.Restfullbooker.e2e_integration;

import com.seleniumtraining.base.BaseTest;
import com.seleniumtraining.endpoints.APIConstants;
import com.seleniumtraining.pojos.restfullbooker.response.BookingResponse;
import io.qameta.allure.Owner;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestIntegrationFlow2 extends BaseTest {
    // Create Booking -> Delete it -> Verify
    @Test(groups = "Qa", priority = 1)
    @Owner("Shafna")
    @Description("TC1 - Step 1. Verify that the Booking can be Created")
    public void testCreateBooking(ITestContext iTestContext){

        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);
        response = RestAssured.given(requestSpecification)
                .when().body(payloadManager.createPayloadBookingAsString())
                .post();
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
        BookingResponse bookingResponse = payloadManager.bookingResponseJava(response.asString());
        assertActions.verifyStringKey(bookingResponse.getBooking().getFirstname(), "Pramod");
        assertActions.verifyStringKeyNotNull(bookingResponse.getBookingid());

        Integer bookingid = bookingResponse.getBookingid();
        iTestContext.setAttribute("bookingid",bookingid);
}
    //Deleting
    @Test(groups = "Qa", priority = 2)
    @Owner("Shafna")
    @Description("TC2 - Step 2. Delete the Booking by ID")
    public void testDeleteBookingById(ITestContext iTestContext){

        Integer bookingid = (Integer) iTestContext.getAttribute("bookingid");
        String token = getToken();
        iTestContext.setAttribute("token",token);

        String basePathDELETE = APIConstants.CREATE_UPDATE_BOOKING_URL + "/" + bookingid;

        requestSpecification.basePath(basePathDELETE).cookie("token", token);
        validatableResponse = RestAssured.given().spec(requestSpecification)
                .when().delete().then().log().all();
        validatableResponse.statusCode(201);


    }

    //Verifying delete- 404 status
    @Test(groups = "Qa", priority = 3)
    @Owner("Shafna")
    @Description("TC3 - Step 3. Verify booking is deleted by id")
    public void verifyBookingIsDeleted(ITestContext iTestContext){

        Integer bookingid = (Integer) iTestContext.getAttribute("bookingid");
        String basePathGET = APIConstants.CREATE_UPDATE_BOOKING_URL + "/" + bookingid;
        requestSpecification.basePath(basePathGET);
        validatableResponse = RestAssured
                .given()
                .spec(requestSpecification)
                .when()
                .get()
                .then()
                .log().all();

        // Assert that booking no longer exists
        validatableResponse.statusCode(404);


    }

}
