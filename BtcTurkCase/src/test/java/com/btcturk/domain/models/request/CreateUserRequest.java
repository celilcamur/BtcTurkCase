package com.btcturk.domain.models.request;

import com.btcturk.domain.entities.User;

public class CreateUserRequest {
    public String name;
    public String job;

    public CreateUserRequest(User user) {
        this.name = user.name;
        this.job = user.job;
    }
}
