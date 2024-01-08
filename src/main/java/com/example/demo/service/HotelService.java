package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Hotel;



public interface HotelService {

	Hotel createHotel(Hotel hotel);

	List<Hotel> getAllHotelList();

	Hotel getHotelById(String hotelid);

	

	

}
