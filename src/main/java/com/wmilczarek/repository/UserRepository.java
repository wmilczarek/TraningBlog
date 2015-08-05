package com.wmilczarek.repository;

import com.wmilczarek.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    @Query("FROM UserEntity order by id")
    List<UserEntity> findAll();

    @Query("FROM UserEntity as userEntity WHERE userEntity.login = :name")
    long findUserByName(String name);


    /*@Query("FROM UserEntity as userEntity WHERE userEntity.isActive = true")
    List<UserEntity> findAllActive();*/
}

