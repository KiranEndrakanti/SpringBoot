package com.kiran.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kiran.demo.Employe;

public interface EmployeRepo extends CrudRepository<Employe, Integer>{
	 // here we have given Employee is the object which we are working and the Id id of type Int
	
	public abstract List<Employe> findByTech(String tech);
	public abstract List<Employe> findByName(String name);
	
}
