package com.example.employee_managment.impl;

import org.springframework.stereotype.Service;

import com.example.employee_managment.dto.EmployeeDto;
import com.example.employee_managment.entity.Employee;
import com.example.employee_managment.mapper.EmployeeMapper;
import com.example.employee_managment.repository.EmployeeRepository;
import com.example.employee_managment.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
	@AllArgsConstructor
	public class EmployeeServiceImpl implements EmployeeService {

		
		private EmployeeRepository employeeRepository;
		
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(employee);
				
				return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}
	}