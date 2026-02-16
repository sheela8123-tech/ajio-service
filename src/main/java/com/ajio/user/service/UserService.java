package com.ajio.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ajio.user.entity.UserEntity;
import com.ajio.user.repository.UserRepository;
import com.ajio.user.request.UserRequest;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create a new user
    public int createUser(UserRequest request) {
        UserEntity entity = new UserEntity();
        entity.setFirstName(request.getFirstName());
        entity.setLastName(request.getLastName());
        entity.setAddress(request.getAddress());

        entity = userRepository.save(entity);
        return entity.getId();
    }

    // Get paginated users here
    public Page<UserEntity> getUsers(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return userRepository.findAll(pageable);
    }
    
//    public List<UserEntity> getUserByFirstName(String firstName)
//    {
//    	return userRepository.findByFirstName(firstName);
//    }
//    
//    public List<UserEntity> getUserByLastName(String lastName)
//    {
//    	return userRepository.findByLastName(lastName);
//    }
//    
//    public List<UserEntity> getUserByFisrNameAndLastName(String firstName,String lastName)
//    {
//    	return userRepository.findByFirstNameAndLastName(firstName, lastName);
//    }
//    
//    public boolean existsUserByFirstName(String firstName)
//    {
//    	return userRepository.existsByFirstName(firstName);
//    }
    
    
   public List<UserEntity> getUserByFirstName(String firstName)
    {
    	return userRepository.findByFirstName(firstName);
    }
    
}
