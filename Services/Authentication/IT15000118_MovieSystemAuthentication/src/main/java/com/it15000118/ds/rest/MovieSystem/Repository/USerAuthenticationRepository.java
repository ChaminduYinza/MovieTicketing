package com.it15000118.ds.rest.MovieSystem.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.it15000118.ds.rest.MovieSystem.Model.UserAuthenticationModel;


@Repository
public interface USerAuthenticationRepository extends MongoRepository<UserAuthenticationModel, String>{
	public List<UserAuthenticationModel> findAll();
	public UserAuthenticationModel findByuserName(String ID);
	public UserAuthenticationModel save(UserAuthenticationModel objDialogEz);
	public void delete(UserAuthenticationModel objDialogEz);
}
