package com.it15000118.ds.rest.MovieSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.it15000118.ds.rest.MovieSystem.Model.MovieReservationModel;
import com.it15000118.ds.rest.MovieSystem.Repository.movieReservationRepository;


//Enabling cross origin so this api can be access from outside parties
@RestController
@RequestMapping("/api/movieReservation")
@CrossOrigin
public class movieReservationController {

	@Autowired
	movieReservationRepository objMovieResRepo;
//Fetch all records in the database
	@RequestMapping(method = RequestMethod.GET)
	public List<MovieReservationModel> getAllReservations() {

		return objMovieResRepo.findAll();

	}
	//Add new reservation record do the database
	@RequestMapping(method = RequestMethod.POST)
	public MovieReservationModel addNewReservation(@RequestBody MovieReservationModel objMovieModel){
		
		return objMovieResRepo.save(objMovieModel);
		
	}
}
