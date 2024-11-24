package com.hotel.HotelService.services.Impl;

import com.hotel.HotelService.entity.Hotel;
import com.hotel.HotelService.exceptions.ResourceNotFoundException;
import com.hotel.HotelService.repositories.HotelReposetory;
import com.hotel.HotelService.services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelServices {
    @Autowired
    private HotelReposetory hotelReposetory;


    @Override
    public Hotel createHotel(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelReposetory.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelReposetory.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        return hotelReposetory.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with given id is not found"));
    }
}
