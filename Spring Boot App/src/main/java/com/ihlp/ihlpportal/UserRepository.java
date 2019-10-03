package com.ihlp.ihlpportal;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends Repository<User, Integer> {


    List<User> findAll();

    User save(User user);
    
    void delete(User user);
    
    User findById(int id);
}
