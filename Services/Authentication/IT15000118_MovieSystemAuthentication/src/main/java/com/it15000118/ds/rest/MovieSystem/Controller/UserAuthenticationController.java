package com.it15000118.ds.rest.MovieSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.it15000118.ds.rest.MovieSystem.Model.UserAuthenticationModel;

import com.it15000118.ds.rest.MovieSystem.Repository.USerAuthenticationRepository;

@RestController
@RequestMapping("/api/userAuthentication")
//Enabling cross origin so this api can be access from outside parties
@CrossOrigin
public class UserAuthenticationController {

	@Autowired
	USerAuthenticationRepository objUserAuth;

	@RequestMapping(value = "/userName", method = RequestMethod.GET)
	public UserAuthenticationModel validateAuthentication(@PathVariable("userName") String uName,
			@RequestBody UserAuthenticationModel objAuthenModel) {

		return objUserAuth.findByuserName(uName);

	}
	//Validating provided username and password with the database sorted username and passwords
	@CrossOrigin
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public boolean validateUser(@RequestBody UserAuthenticationModel objAuthenModel) {
		UserAuthenticationModel uModel = objUserAuth.findByuserName(objAuthenModel.getUserName());
		System.out.println(uModel.getPassWord());
		System.out.println(objAuthenModel.getPassWord());		

		if (uModel != null && uModel.getPassWord().equals(objAuthenModel.getPassWord())) {
			return true;
		} else {
			return false;
		}

	}
//Adding new members,users to the database
	@RequestMapping(method = RequestMethod.POST)
	public UserAuthenticationModel addNewUser(@RequestBody UserAuthenticationModel objAuthModel) {

		return objUserAuth.save(objAuthModel);
	}

}
