package com.rating.services.impl;

import com.rating.entities.Rating;
import com.rating.repositories.RatingReposiitory;
import com.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingReposiitory ratingReposiitory;
    @Override
    public Rating createRating(Rating rating) {
        return ratingReposiitory.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingReposiitory.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingReposiitory.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelID(String hotelId) {
        return ratingReposiitory.findByHotelId(hotelId);
    }
}
