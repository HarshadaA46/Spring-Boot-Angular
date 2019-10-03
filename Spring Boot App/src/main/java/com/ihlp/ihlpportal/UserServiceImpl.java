package com.ihlp.ihlpportal;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserRepository repository;


	@Override
	public User create(User user) {
		return repository.save(user);
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User findById(int id) {
		return repository.findById(id);
	}
	

	@Override
	public User delete(int id) {
		User user = repository.findById(id);
        if(user != null){
            repository.delete(user);
        }
        return user;
	}

}
