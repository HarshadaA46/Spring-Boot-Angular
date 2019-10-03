package com.ihlp.ihlpportal;

import java.util.List;

public interface UserService {
	
	public User create(User user);
	
	public User delete(int id);
	
	public List<User> findAll();
	
	public User findById(int id);

}
