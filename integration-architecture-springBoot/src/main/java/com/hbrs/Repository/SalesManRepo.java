package com.hbrs.Repository;

import com.hbrs.Data.SalesMan;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


/**
 * <<interface>>
 * repository that extends MongoRepository<Java Object, id(String)>
 * you can create your own methods
 */
public interface SalesManRepo extends MongoRepository<SalesMan,String> {

    // Optional: the object can be null or not
    Optional<SalesMan> findSalesManBySid(int sid);

    void deleteSaleManBySid(int sid);
}
