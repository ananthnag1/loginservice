package com.rest.service.service;

import com.rest.service.entity.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
