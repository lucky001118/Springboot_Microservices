package com.UserService.external.service;

import com.UserService.entities.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="HOTELSERVICE")
public interface HotelService {
    @GetMapping("hotels/{hotelId}")
    Hotel getHotelByHotelID(@PathVariable String hotelId);
}
