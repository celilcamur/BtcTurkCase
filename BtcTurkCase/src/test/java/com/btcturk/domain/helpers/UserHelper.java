package com.btcturk.domain.helpers;

import com.btcturk.domain.models.response.UserResponse;
import com.btcturk.domain.models.response.UsersResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.btcturk.domain.clients.UsersClient;
import com.btcturk.domain.entities.User;
import com.btcturk.domain.models.request.CreateUserRequest;
import com.btcturk.domain.models.response.CreateUserResponse;

public class UserHelper {
    private UsersClient usersClient;


    public UserHelper(UsersClient usersClient) {
        super();
        this.usersClient = usersClient;
    }


    public CreateUserResponse createUser(User user) throws UnirestException {
        return usersClient.createUser(new CreateUserRequest(user));
    }

    public int createUserWithStatusCode(User user) throws UnirestException {
        return usersClient.createUserWithStatusCode(new CreateUserRequest(user));
    }

    public UserResponse getUser() throws UnirestException {
        return usersClient.getUser();
    }

    public int getUserWithStatusCode() throws UnirestException {
        return usersClient.getUserWithStatusCode();
    }

    public UsersResponse getUsers() throws UnirestException {
        return usersClient.getUsers();
    }

    public int getUsersWithStatusCode() throws UnirestException {
        return usersClient.getUsersWithStatusCode();
    }
}
