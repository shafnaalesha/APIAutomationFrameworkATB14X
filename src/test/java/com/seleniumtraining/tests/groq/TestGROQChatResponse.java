package com.seleniumtraining.tests.groq;

import com.seleniumtraining.base.BaseTest;
import com.seleniumtraining.endpoints.APIConstants;
import com.seleniumtraining.pojos.groq.response.ChatCompletionResponse;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

public class TestGROQChatResponse extends BaseTest {
    @Test(groups = "reg", priority = 1)
    @Owner("Pramod Dutta")
    @Description("TC#1 - Verify GROW")
    public void test_GROQ_CHAT() {
        // Setup will first and making the request - Part - 1
        requestSpecification.baseUri(APIConstants.GROQ_BASE_URL);
        requestSpecification.basePath(APIConstants.GROQ_CHAT);
        requestSpecification.header("Authorization","Bearer <>");


        response = RestAssured.given(requestSpecification)
                .when().body(groqPayloadManger.setBuildRequest()).log().all()
                .post();

        //Extraction Part - 2
        ChatCompletionResponse chatCompletionResponse = groqPayloadManger.parseResponse(response.asString());

        // Validation and verification via the AssertJ, TestNG Part - 3
        String response_chat = chatCompletionResponse.getChoices().get(0).getMessage().getContent();

        assertActions.verifyStatusCode(response,200);
        assertActions.verifyStringKeyNotNull(response_chat);










    }


}
