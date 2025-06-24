package com.data.maven_mysql_data_jpa_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
   

}
