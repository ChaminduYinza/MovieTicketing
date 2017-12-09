package com.it15000118.ds.rest.MovieSystem.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.it15000118.ds.rest.MovieSystem.Model.DialogEzCashModel;


@Repository
public interface DialogEzCashRepository extends MongoRepository<DialogEzCashModel, String>{
	public List<DialogEzCashModel> findAll();
	public DialogEzCashModel findOne(String ID);
	public DialogEzCashModel save(DialogEzCashModel objDialogEz);
	public void delete(DialogEzCashModel objDialogEz);
}
