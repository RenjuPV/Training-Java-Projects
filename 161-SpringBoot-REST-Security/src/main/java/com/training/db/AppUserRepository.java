package com.training.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.model.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
	
	AppUser findByUserName(String userName);
	
	//AppUser findByUserNameAndPassword(String userName,String password);

}
