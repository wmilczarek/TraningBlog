package com.wmilczarek.repository;

import com.wmilczarek.entity.Example;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExampleRepository extends CrudRepository<Example, Long>{
        //extends JpaRepository<ExampleEntity, Long> {

 @Query("from Example order by id")
 List<Example> findAll();

}
