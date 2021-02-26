package com.pduarte.hruser.resources;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pduarte.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
