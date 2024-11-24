package com.hotel.HotelService.repositories;

import com.hotel.HotelService.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelReposetory extends JpaRepository<Hotel,String> {
}
