package com.springboot.angularjpa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.angularjpa.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
