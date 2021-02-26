package com.realcozy.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.realcozy.model.EmployeeType;
import com.realcozy.model.Status;

public interface StatusRepo extends  CrudRepository<Status, String> {

}
