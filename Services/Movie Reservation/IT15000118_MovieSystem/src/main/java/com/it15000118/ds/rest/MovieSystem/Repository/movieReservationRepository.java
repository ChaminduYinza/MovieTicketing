package com.it15000118.ds.rest.MovieSystem.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.it15000118.ds.rest.MovieSystem.Model.MovieReservationModel;

@Repository
public interface movieReservationRepository extends MongoRepository<MovieReservationModel, String> {

	public List<MovieReservationModel> findAll();
	public MovieReservationModel findOne(String ID);
	public MovieReservationModel save(MovieReservationModel objMovieRes);
	public void delete(MovieReservationModel objMovieRes);
}
