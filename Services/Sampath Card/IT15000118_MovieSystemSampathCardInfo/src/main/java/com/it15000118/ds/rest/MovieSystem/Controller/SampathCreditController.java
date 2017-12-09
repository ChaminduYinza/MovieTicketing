package com.it15000118.ds.rest.MovieSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.it15000118.ds.rest.MovieSystem.Model.SampathCreditModel;
import com.it15000118.ds.rest.MovieSystem.Repository.SampathCreditRepository;

//Enabling cross origin so this api can be access from outside parties
@RestController
@RequestMapping("/api/sampathCredit")
@CrossOrigin
public class SampathCreditController {

	@Autowired
	SampathCreditRepository objSampathRepo;
//Fetch all records in the database
	@RequestMapping(method = RequestMethod.GET)
	public List<SampathCreditModel> getAllCreditRecords() {

		return objSampathRepo.findAll();

	}
	//Add new payment record do the database
	@RequestMapping(method = RequestMethod.POST)
	public SampathCreditModel addCreditInfor(@RequestBody SampathCreditModel objCreditModel) {
		return objSampathRepo.save(objCreditModel);
	}
}
