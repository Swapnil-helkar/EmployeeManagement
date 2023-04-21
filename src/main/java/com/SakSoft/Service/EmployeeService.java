package com.SakSoft.Service;

import java.util.List;
import java.util.Optional;

import com.SakSoft.Entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee e);

	Employee updateEmployee(Employee e);

	Optional<Employee> getEmployee(int id) ;

	List<Employee> getAllEmployees();

	void deleteEmployee(int id);

}
