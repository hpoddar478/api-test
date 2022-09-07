package com.restassured;

import com.pojo.RegisterResponse;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostExamples {

    @Test
    public void post_tc_1(){

        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

        JSONObject requestPayload = new JSONObject();
        requestPayload.put("name","morpheus");
        requestPayload.put("job","leader");


        Response response = RestAssured.given().body(requestPayload.toString()).when().post("api/users");

        System.out.println(response.asPrettyString());

        System.out.println(response.getStatusCode());
    }


    @Test
    public void post_tc_2(){

        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

        /*org.json.simple.JSONObject requestPayload = new org.json.simple.JSONObject();
        requestPayload.put("email","eve.holt@reqres.in");
        requestPayload.put("password","cityslicka");*/

        RegisterResponse resObj = new RegisterResponse();
        resObj.setEmail("eve.holt@reqres.in");
        resObj.setPassword("pistol");


        Response response = RestAssured.given().body(resObj).contentType("application/json").when().post("api/login");

        System.out.println(response.asPrettyString());

        System.out.println(response.getStatusCode());
        Assert.assertTrue(response.jsonPath().getString("token").equalsIgnoreCase("QpwL5tke4Pnpja7X4"));
    }
}
