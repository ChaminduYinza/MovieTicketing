package com.it15000118.ds.rest.MovieSystem.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.it15000118.ds.rest.MovieSystem.Model.SampathCreditModel;


@Repository
public interface SampathCreditRepository extends MongoRepository<SampathCreditModel, String> {
	public List<SampathCreditModel> findAll();
	public SampathCreditModel findOne(String ID);
	public SampathCreditModel save(SampathCreditModel objSampatheRes);
	public void delete(SampathCreditModel objSampatheRes);

}
