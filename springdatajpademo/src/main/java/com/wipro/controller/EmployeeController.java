package com.wipro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.entity.Employee;
import com.wipro.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.addEmployee(employee),HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
    	return new ResponseEntity<List<Employee>>(employeeService.getAllEmployee(),HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable Long id) {
    	Optional<Employee> employee = employeeService.getEmployeeById(id);
    	if(employee == null) {
        	return new ResponseEntity<Optional<Employee>>(HttpStatus.NOT_FOUND);
    	}
    	return new ResponseEntity<Optional<Employee>>(employee,HttpStatus.OK);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable Long id, @Valid @RequestBody Employee employee) {
    	Optional<Employee> getEmployee = employeeService.getEmployeeById(id);
    	if(getEmployee == null) {
        	return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
    	}
    	return new ResponseEntity<Employee>(employeeService.updateEmployeeById(id, employee),HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployeeById(@PathVariable Long id) {
    	return new ResponseEntity<Object>(employeeService.deleteEmployeeById(id),HttpStatus.OK);
    }
    
    @GetMapping("/sorted")
    public ResponseEntity<List<Employee>> getEmployeesSorted(@RequestParam(defaultValue = "id") String sortBy, @RequestParam(defaultValue = "ASC") String sortDirection) {
    	return new ResponseEntity<List<Employee>>(employeeService.getEmployeeSorted(sortBy, sortDirection), HttpStatus.OK);
    }
    
    @GetMapping("/{name}/{job}")
    public ResponseEntity<Employee> getEmployeeByNameAndJob(@PathVariable String name, @PathVariable String job) {
    	return new ResponseEntity<Employee>(HttpStatus.OK);
    }
    
    @GetMapping("/pagination")
    public ResponseEntity<Page> getEmployeeByPagination(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size) {
		return new ResponseEntity<Page>(employeeService.getEmployeeByPagination(page, size), HttpStatus.OK);
    }
    
    @GetMapping("/paginationSorting")
    public ResponseEntity<Page> getEmployeeByPaginationAndSorting(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size, @RequestParam(defaultValue = "name") String name) {
    	return new ResponseEntity<Page>(employeeService.getEmployeeByPaginationAndSorting(page, size, name), HttpStatus.OK);
    }
}	