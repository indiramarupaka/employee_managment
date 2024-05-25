package com.example.employee_managment.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee_managment.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
