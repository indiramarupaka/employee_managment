package com.example.employee_managment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_managment.dto.EmployeeDto;
import com.example.employee_managment.service.EmployeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
	@RestController
	@RequestMapping("/api/employees")
	public class EmployeeController  {
		
		private EmployeeService employeeService;
		
		@PostMapping
		public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
		
			EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
		}
		
		}

