package com.seleniumtraining.base;

import com.seleniumtraining.asserts.AssertActions;
import com.seleniumtraining.endpoints.APIConstants;

import com.seleniumtraining.modules.groqpayloadmanager.GROQPayloadManager;
import com.seleniumtraining.modules.restfulbooker.PayloadManager;

import com.seleniumtraining.modules.vwo.vwoPayloadManager;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    // CommonToAll Testcase
    //   // Base URL, Content Type - json - common
    public RequestSpecification requestSpecification;
    public Response response;
    public ValidatableResponse validatableResponse;

    public PayloadManager payloadManager;
    public vwoPayloadManager vwoPayloadManager;
   public GROQPayloadManager groqPayloadManger;
    public JsonPath jsonPath;
    public AssertActions assertActions;


    @BeforeTest
    public void setup() {
        System.out.println("Starting of the Test");
        payloadManager = new PayloadManager();
        vwoPayloadManager = new vwoPayloadManager();
        groqPayloadManger = new GROQPayloadManager();
        assertActions = new AssertActions();

//        requestSpecification = RestAssured.given();
//        requestSpecification.baseUri(APIConstants.BASE_URL);
//        requestSpecification.contentType(ContentType.JSON);

        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(APIConstants.BASE_URL)
                .addHeader("Content-Type", "application/json")
                .build().log().all();

    }

    public  String getToken(){
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri(APIConstants.BASE_URL)
                .basePath(APIConstants.AUTH_URL);
        // Setting the payload
        String payload = payloadManager.setAuthPayload();
        // Get the Token
        response = requestSpecification.contentType(ContentType.JSON).body(payload).when().post();
        String token = payloadManager.getTokenFromJSON(response.asString());
        return token;

    }

    @AfterTest
    public void tearDown() {
        System.out.println("Finished the Test!");
    }
}
