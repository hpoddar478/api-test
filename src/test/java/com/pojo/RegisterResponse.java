


package com.pojo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RegisterResponse {

    @Override
    public String toString() {
        return "RegisterResponse{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;



}