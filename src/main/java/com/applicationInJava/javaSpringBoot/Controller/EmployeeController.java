package com.applicationInJava.javaSpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.applicationInJava.javaSpringBoot.Entity.Employee;
import com.applicationInJava.javaSpringBoot.Repository.EmployeeRepository;

import jakarta.persistence.EntityManager;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
    private EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
    
    @Autowired
    EntityManager entityManager;

    @GetMapping("/test")
    public List<?> testQuery() {
        return entityManager.createNativeQuery("SELECT * FROM EMPLOYEE").getResultList();
    }
    
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }
}
