package com.SakSoft.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SakSoft.Dao.EmployeeRepo;
import com.SakSoft.Entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo repo;

	@Override
	public Employee addEmployee(Employee e) {
		Employee save = repo.save(e);
		return save;
	}

	@Override
	public Employee updateEmployee(Employee e) {
		Employee update = repo.save(e);
		return update;
	}

	@Override
	public Optional<Employee> getEmployee(int id) {
		Optional<Employee> findById = repo.findById(id);

		return findById;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public void deleteEmployee(int id) {
		repo.deleteById(id);

	}

}
