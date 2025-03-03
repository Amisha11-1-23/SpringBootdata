package com.example.Dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dto.Emp;

import java.util.List;



@Repository
public interface EmpRepository extends CrudRepository<Emp, Integer>  {

   // public  Optional<Emp> findById(int id);
    public Emp findById(int id);
    
}