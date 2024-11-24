package com.hotel.HotelService.services;

import com.hotel.HotelService.entity.Hotel;

import java.util.List;

public interface HotelServices {
    //create
    Hotel createHotel(Hotel hotel);

    //get all
    List<Hotel> getAll();


    //get one
    Hotel getHotel(String id);
}
