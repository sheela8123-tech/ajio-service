package com.ajio.user.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajio.user.entity.UserEntity;
import com.ajio.user.repository.UserRepository;
import com.ajio.user.request.UserRequest;
import com.ajio.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {



    @Autowired
    private UserService userService;


    // Create user API
    @PostMapping("/createUser")
    public int createUser(@RequestBody UserRequest request) {
        return userService.createUser(request);
    }


    
    @GetMapping("/getUsers")
    public Page<UserEntity> getUserPage(int page, int size)
    {
    	Pageable pageable = PageRequest.of(page, size);
    	return userService.getUsers(page, size);
    }
    
//    @GetMapping("/byFirstName")
//    public List<UserEntity> getUserByFirstName(@RequestParam String firstName)
//    {
//    	return userService.getUserByFirstName(firstName);
//    }
//    
//    @GetMapping("/byLastName")
//    public List<UserEntity> getUserByLastName(String lastName)
//    {
//    	return userService.getUserByLastName(lastName);
//    }
//    
//    @GetMapping("/byFullName")
//    public List<UserEntity> getUserByFullName(String firstName,String lastName)
//    {
//    	return userService.getUserByFisrNameAndLastName(firstName, lastName);
//    }
//    
//    @GetMapping("/exists")
//    boolean existsByFirstName(String firstName) 
//    {
//    	return userService.existsUserByFirstName(firstName);
//    }
    
    @GetMapping("/getUserByName")
   public  List<UserEntity> getUserByFirstName(String firstName)
   {
	   return userService.getUserByFirstName(firstName);
   }
}
