package com.mrmodise.service;

import com.mrmodise.domain.User;

public interface UserService {
	public User findByEmail(String email);
}
