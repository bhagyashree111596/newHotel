package com.example.demo.controller;

import java.util.List;
import java.util.UUID;

import com.example.demo.entity.Hotel;
import com.example.demo.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	@Autowired
	private HotelService hotelService;

	@PostMapping
	public ResponseEntity<Hotel> createUser(@RequestBody Hotel hotel){
		String hoteiid=UUID.randomUUID().toString();
		hotel.setHotelid(hoteiid);
		Hotel hotel1=   hotelService.createHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
		   
	}
	@GetMapping("/{hotelid}")
	public ResponseEntity<Hotel> getHotelByIdctrl(@PathVariable String hotelid){
		Hotel user1=hotelService.getHotelById(hotelid);
			return	ResponseEntity.ok(user1);
		   
	}
	@GetMapping()
	public ResponseEntity<List<Hotel>> getAllHotelList(){
		   List<Hotel> user1=hotelService.getAllHotelList();
		   return ResponseEntity.ok(user1);
	}

}


