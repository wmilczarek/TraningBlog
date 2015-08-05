package com.wmilczarek.repository;

import com.wmilczarek.entity.ShoutEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoutRepository extends CrudRepository<ShoutEntity, Long> {

    @Query("FROM ShoutEntity order by id")
    List<ShoutEntity> findAll();

    @Query("FROM ShoutEntity as shoutEntity WHERE shoutEntity.isActive = true order by date_time")
    List<ShoutEntity> findAllActive();

}
