package com.restassured;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PutPatchDelete {
    @Test
    public void put_tc(){

        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

        JSONObject requestPayload = new JSONObject();
        requestPayload.put("name","morpheus");
        requestPayload.put("job","zion resident");


        Response response = RestAssured.given().body(requestPayload.toString()).when().put("api/users/2");

        System.out.println(response.asPrettyString());

        System.out.println(response.getStatusCode());
    }
    @Test
    public void patch_tc(){

        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

        JSONObject requestPayload = new JSONObject();
        requestPayload.put("name","morpheus");
        requestPayload.put("job","zion resident");


        Response response = RestAssured.given().body(requestPayload.toString()).when().patch("api/users/2");

        System.out.println(response.asPrettyString());

        System.out.println(response.getStatusCode());
    }

    @Test
    public void delete_tc(){

        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

        Response response = RestAssured.given().when().delete("api/users/2");

        System.out.println(response.asPrettyString());

        System.out.println(response.getStatusCode());
    }


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }

    @BeforeTest
    public void bfTest(){
        System.out.println("before test");
    }
}