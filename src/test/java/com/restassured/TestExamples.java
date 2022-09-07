package com.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestExamples {

    @Test
    public void test_1(){
        RestAssured.baseURI = "https://reqres.in/";
        Response response = RestAssured.get("api/users?page=2");

        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusCode());
        Assert.assertTrue(response.jsonPath().getInt("data[0].id") == 7,"Id value is not matching");

        JSONObject resObj = new JSONObject(response.asString());

        JSONArray dataArray = resObj.getJSONArray("data");

        ArrayList<String> actualNames = new ArrayList<>();

        for(int i=0;i<dataArray.length();i++){

            JSONObject tmp = dataArray.getJSONObject(i);
            String fName =tmp.getString("first_name");
            actualNames.add(fName);
        }

        List<String> expectedNames = Arrays.asList("Michael","Lindsay","Tobias","Byron","George","Rachel");

        Assert.assertTrue(actualNames.equals(expectedNames));
        Assert.assertTrue(response.jsonPath().getString("support.url").equalsIgnoreCase("https://reqres.in/#support-heading"),
                "Url is not as expected");
    }




    @Test
    public void test_2(){

        RestAssured.baseURI = "https://reqres.in/";
        Response response = RestAssured.given().get("api/users/2");

        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getHeader("content-type"));

       // Assert.assertTrue(response.getStatusCode() ==200,"Response code is not as expected");

        JSONObject resObj = new JSONObject(response.asString());

        JSONObject tempObj = resObj.getJSONObject("data");

        System.out.println(tempObj.getInt("id"));
        System.out.println(tempObj.getString("email"));
        System.out.println(tempObj.getString("first_name"));
        System.out.println(tempObj.getString("last_name"));
        System.out.println(tempObj.getString("avatar"));


    }

}
