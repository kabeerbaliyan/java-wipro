package com.wipro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import com.wipro.entity.Employee;
import com.wipro.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}

	public Employee updateEmployeeById(Long id, Employee updatedEmployee) {
		return employeeRepository.findById(id).map(employee -> {
			employee.setName(updatedEmployee.getName());
			employee.setJob(updatedEmployee.getJob());
			return employeeRepository.save(employee);
		}).orElse(null);
	}

	public Object deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
		return "Employee id with " + id + " deleted";
	}
	
	public List<Employee> getEmployeeSorted(String sortBy, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        return employeeRepository.findAll(sort);
	}

	public Optional<Employee> getEmployeeByNameAndJob(String name, String job) {
		return employeeRepository.findByNameAndDepartment(name, job) != null ? employeeRepository.findByNameAndDepartment(name, job) : null;
	}

	public Page getEmployeeByPagination(int page, int size) {
		Pageable pageable = PageRequest.of(page, size);
		return employeeRepository.findAll(pageable);
	}

	public Page<Employee> getEmployeeByPaginationAndSorting(int page, int size, String name) {
		Pageable pageable = PageRequest.of(page, size, Sort.by(name));
		return employeeRepository.findAll(pageable);
	}
}