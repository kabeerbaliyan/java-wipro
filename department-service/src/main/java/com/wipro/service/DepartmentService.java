package com.wipro.service;

import java.util.List;

import com.wipro.dto.DepartmentDTO;

public interface DepartmentService {
    List<DepartmentDTO> getAllDepartments();
    DepartmentDTO getDepartmentById(Long id);
    DepartmentDTO createDepartment(DepartmentDTO departmentDTO);
    DepartmentDTO updateDepartment(Long id, DepartmentDTO departmentDTO);
    void deleteDepartment(Long id);
}