package com.seleniumtraining.modules.vwo;

import com.google.gson.Gson;
import com.seleniumtraining.pojos.vwo.request.LoginRequest;
import com.seleniumtraining.pojos.vwo.response.LoginResponse;

public class vwoPayloadManager {
    Gson gson;
    // Java Object -> JSON
    public String setLoginData() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername("shafna.sham@yahoo.co.in");
        loginRequest.setPassword("abc");

        gson = new Gson();
        String jsonPayloadString = gson.toJson(loginRequest);
        System.out.println("Payload Login to the -> " + jsonPayloadString);
        return jsonPayloadString;
    }
        // DeSer ( JSON String -> Java Object
        public LoginResponse getLoginData(String loginResponseEx){
            gson = new Gson();
            LoginResponse loginResponse = gson.fromJson(loginResponseEx, LoginResponse.class);
            return loginResponse;
        }
    }

