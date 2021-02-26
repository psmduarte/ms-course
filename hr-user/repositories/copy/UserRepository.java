package com.pduarte.hruser.repositories.copy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pduarte.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
