package com.niterx.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.niterx.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    
}
