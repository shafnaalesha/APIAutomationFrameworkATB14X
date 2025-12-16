package com.seleniumtraining.modules.groqpayloadmanager;

import com.google.gson.Gson;
import com.seleniumtraining.pojos.groq.request.ChatRequest;
import com.seleniumtraining.pojos.groq.request.Message;

import com.seleniumtraining.pojos.groq.response.ChatCompletionResponse;
import java.util.Collections;

public class GROQPayloadManager {
    static Gson gson;

    public void buildRequest() {
        ChatRequest chatRequest = new ChatRequest();
        chatRequest.setModel("openai/gpt-oss-120b");
        Message message = new Message("user", "Explain the POJO");
        chatRequest.setMessages(Collections.singletonList(message));
    }

    public String setBuildRequest() {
        gson = new Gson();
        ChatRequest chatRequest = new ChatRequest();
        chatRequest.setModel("openai/gpt-oss-120b");
        Message message = new Message("user", "Explain the POJO");
        chatRequest.setMessages(Collections.singletonList(message));
        return gson.toJson(chatRequest);
    }

    public static ChatCompletionResponse parseResponse(String jsonResponse) {
        gson = new Gson();
        return gson.fromJson(jsonResponse, ChatCompletionResponse.class);
    }
}
