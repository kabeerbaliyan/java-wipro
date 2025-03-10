package com.wipro.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {  
   
    // Find employee by name
    Optional<Employee> findByName(String name);
    
    // Find employee by name and department (optional but useful)
    Optional<Employee> findByNameAndDepartment(String name, String department);
}
