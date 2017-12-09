package com.it15000118.ds.rest.MovieSystem.Model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection="MovieReservation")
public class MovieReservationModel {

	@Id
	private String Id;
	
	private String customerName;
	private String movieName;
	private String movieTime;
	private String seatNumbers;
	private String snackOrder;
	
	public MovieReservationModel(){
		
	}
	
	public MovieReservationModel(String customerName, String movieName, String movieTime, String seatNumbers,
			String snackOrder) {
		super();
		this.customerName = customerName;
		this.movieName = movieName;
		this.movieTime = movieTime;
		this.seatNumbers = seatNumbers;
		this.snackOrder = snackOrder;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieTime() {
		return movieTime;
	}

	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}

	public String getSeatNumbers() {
		return seatNumbers;
	}

	public void setSeatNumbers(String seatNumbers) {
		this.seatNumbers = seatNumbers;
	}

	public String getSnackOrder() {
		return snackOrder;
	}

	public void setSnackOrder(String snackOrder) {
		this.snackOrder = snackOrder;
	}
	
	
	
}
