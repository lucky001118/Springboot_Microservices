package com.UserService.services.impl;

import com.UserService.entities.Hotel;
import com.UserService.entities.Rating;
import com.UserService.entities.User;
import com.UserService.exceptions.ResourceNotFoundException;
import com.UserService.external.service.HotelService;
import com.UserService.external.service.RatingService;
import com.UserService.repositories.UserRepositories;
import com.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositories userRepositories;

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HotelService hotelService;

    @Autowired
    private RatingService ratingService;
    @Override
    public User saveUser(User user) {
        //generate unique user id
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepositories.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepositories.findAll();
    }

    @Override
    public User getUser(String userID) {
        //getting the user from the database with userID
        User user = userRepositories.findById(userID).orElseThrow(()-> new ResourceNotFoundException("User not exist by provided userId !!"+userID));

        //getting the ratings using the userId
        Rating[] userRating = restTemplate.getForObject("http://RATINGSERVICE/ratings/users/"+user.getUserId(),Rating[].class);
        List<Rating> ratings = Arrays.stream(userRating).toList();

        List<Rating> ratingList = ratings.stream().map(rating -> {
            //call the api hotel service to get the hotel
//            ResponseEntity<Hotel> forEntity = restTemplate.getForEntity("http://HOTELSERVICE/hotels/"+rating.getHotelId(), Hotel.class);
//            Hotel hotel = forEntity.getBody();

            Hotel hotel = hotelService.getHotelByHotelID(rating.getHotelId());

            //set the hotel to rating
            rating.setHotels(hotel);
            return rating;
        }).collect(Collectors.toList());

        user.setRatings(ratingList);
        return user;
    }

    public Rating saveRating(Rating rating){
        String randomUserId = UUID.randomUUID().toString();
        rating.setRatingId(randomUserId);
        return ratingService.createRating(rating);
    }


}
