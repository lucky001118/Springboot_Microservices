package com.rating.services;

import com.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    //create rating
    Rating createRating(Rating rating);

    //get all the ratings
    List<Rating> getAllRatings();

    //get the rating by userId
    List<Rating> getRatingByUserId(String userId);

    //get rating by hotelId
    List<Rating> getRatingByHotelID(String hotelId);
}
