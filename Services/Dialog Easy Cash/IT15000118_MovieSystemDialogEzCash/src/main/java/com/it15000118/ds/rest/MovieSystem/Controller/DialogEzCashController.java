package com.it15000118.ds.rest.MovieSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.it15000118.ds.rest.MovieSystem.Model.DialogEzCashModel;
import com.it15000118.ds.rest.MovieSystem.Repository.DialogEzCashRepository;

//Enabling cross origin so this api can be access from outside parties
@RestController
@RequestMapping("/api/dialogEzCash")
@CrossOrigin
public class DialogEzCashController {

//Fetch all records in the database
	@Autowired
	DialogEzCashRepository objCashRepo;

	@RequestMapping(method = RequestMethod.GET)
	public List<DialogEzCashModel> getAllReservations() {

		return objCashRepo.findAll();

	}

	//Add new payment record do the database
	@RequestMapping(method = RequestMethod.POST)
	public DialogEzCashModel addEzCashRecord(@RequestBody DialogEzCashModel objCashModel) {

		return objCashRepo.save(objCashModel);
	}

}
