package com.applicationInJava.javaSpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.applicationInJava.javaSpringBoot.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>  {

}
