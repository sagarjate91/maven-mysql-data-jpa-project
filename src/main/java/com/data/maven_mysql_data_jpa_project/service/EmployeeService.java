package com.data.maven_mysql_data_jpa_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.maven_mysql_data_jpa_project.repository.EmployeeRepository;
import com.model.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
 

    public Employee save(Employee employee) {
      
        return employeeRepository.save(employee); 
}

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.saveAndFlush(employee);
    }

    

   

}
