package com.data.maven_mysql_data_jpa_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.data.maven_mysql_data_jpa_project.service.EmployeeService;
import com.model.Employee;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = "com.model")
public class MavenMysqlDataJpaProjectApplication {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(MavenMysqlDataJpaProjectApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Employee employee = new Employee();
		employee.setFirstName("John");
		employee.setLastName("Doe");
		employee.setEmail("j@gmail.com");
		employee.setPhoneNumber("1234567890");
		employee.setDepartment("IT");
		employee.setDesignation("Developer");
		employee.setAddress("123 Main St");

		employeeService.save(employee);
		System.out.println("Employee saved successfully!");

		System.out.println("All Employees: "+employeeService.findAll());

		Employee employee1 = new Employee();
		employee1.setEmpId(2);
		employee1.setFirstName("Ganesh");
		employee1.setLastName("Doe");
		employee1.setEmail("jhon@gmail.com");
		employee1.setPhoneNumber("1234567890");
		employee1.setDepartment("IT");
		employee1.setDesignation("Developer");
		employee1.setAddress("123 Main St");

		employeeService.updateEmployee(employee1);
  System.out.println("Employee updated successfully!");


	}

}
