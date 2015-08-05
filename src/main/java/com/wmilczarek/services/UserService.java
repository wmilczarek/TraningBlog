package com.wmilczarek.services;

import com.wmilczarek.entity.UserEntity;
import com.wmilczarek.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserEntity> getUsers(){
        return userRepository.findAll();
    }

    public long getUserId(String name){
        return userRepository.findUserByName(name);
    }
}
