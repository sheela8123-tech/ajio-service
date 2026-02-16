package com.ajio.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.ajio.user.entity.UserEntity;

public interface UserRepository extends
                                JpaRepository<UserEntity, Integer>
{
	

	//using derived query 
	
//	public List<UserEntity> findByFirstName(String firstName);
//	
//	public List<UserEntity> findByLastName(String lastName);
//	// it tells SELECT * FROM users WHERE last_name = 'Academy';
//	
//	public List<UserEntity> findByFirstNameAndLastName(String firstName,String lastName);
//	
//	boolean existsByFirstName(String firstName);
	
	//using query paramaeter
	
	
	@Query("select user from UserEntity user where user.firstName= :firstName")
	public List<UserEntity> findByFirstName( @RequestParam String firstName);

}
