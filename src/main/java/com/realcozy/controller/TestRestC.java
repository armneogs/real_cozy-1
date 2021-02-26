package com.realcozy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.realcozy.model.EmployeeType;
import com.realcozy.repo.EmployeeRepo;
import com.realcozy.repo.EmployeeTypeRepo;
import com.realcozy.service.PropertyService;


@RestController
public class TestRestC {
	@Autowired
	EmployeeTypeRepo typeRepo;
	@Autowired
	EmployeeRepo employeeRepo;
	@Autowired
	PropertyService propertyService;
	
	

}
