package com.mrmodise.repository;

import org.springframework.data.repository.CrudRepository;

import com.mrmodise.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	public User findByEmail(String email);
}
