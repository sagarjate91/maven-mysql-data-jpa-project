package com.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "EMPLOYEE_TABLE")
@Getter
@Setter
@ToString
public class Employee {

   @Id
   @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
   Integer empId;
   String firstName;
   String lastName;
   String email;
   String phoneNumber;
   String department;
   String designation;
   String address;


}
