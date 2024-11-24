package com.UserService.services;

import com.UserService.entities.Rating;
import com.UserService.entities.User;

import java.util.List;

public interface UserService {

//    user bussiness logics

//    create the user
    User saveUser(User user);

//    get the all users
    List<User> getAllUser();

    //get the single user with user id
    User getUser(String userID);

//    delete user by userId
//    update user by userId

    public Rating saveRating(Rating rating);
}
