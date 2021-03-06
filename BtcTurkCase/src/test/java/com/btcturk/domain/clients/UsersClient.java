package com.btcturk.domain.clients;

import com.btcturk.core.clients.TokenAwareHttpClient;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.btcturk.domain.models.request.CreateUserRequest;
import com.btcturk.domain.models.response.CreateUserResponse;
import com.btcturk.domain.models.response.UserResponse;
import com.btcturk.domain.models.response.UsersResponse;

public class UsersClient extends TokenAwareHttpClient {

    public CreateUserResponse createUser(CreateUserRequest createUserRequest) throws UnirestException {
        return post("users",createUserRequest)
                .asObject(CreateUserResponse.class)
                .getBody();
    }

    public int createUserWithStatusCode(CreateUserRequest createUserRequest) throws UnirestException {
        return post("users",createUserRequest)
                .asBinary()
                .getStatus();
    }

    public UserResponse getUser() throws UnirestException {
        return get("users/1")
                .asObject(UserResponse.class)
                .getBody();
    }

    public int getUserWithStatusCode() throws UnirestException {
        return get("users/1")
                .asBinary()
                .getStatus();
    }

    public UsersResponse getUsers() throws UnirestException {
        return get("users?page=1")
                .asObject(UsersResponse.class)
                .getBody();
    }

    public int getUsersWithStatusCode() throws UnirestException {
        return get("users?page=1")
                .asBinary()
                .getStatus();
    }
}