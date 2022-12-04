package dev.avanish.basic.service;

import dev.avanish.basic.entity.Department;
import dev.avanish.basic.error.DepartmentNotFound;

import java.util.List;

public interface DepartmentService {
    Department save(Department department);

    List<Department> fetchDepartment();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFound;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
