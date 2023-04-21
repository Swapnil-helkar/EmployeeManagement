package com.SakSoft.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SakSoft.Entity.Employee;
import com.SakSoft.Service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl service;

	@PostMapping("/addEmplooyee")
	public Employee addEmployee(@RequestBody Employee e) {
		Employee addEmployee = service.addEmployee(e);
		return addEmployee;
	}

	@PutMapping("/updateEmplooyee")
	Employee updaEmployee(@RequestBody Employee e) {
		Employee updateEmployee = service.updateEmployee(e);

		return updateEmployee;
	}

	@GetMapping("/getEmployee/{id}")
	Optional<Employee> getEmployee(@PathVariable(value = "id") Integer id)  {
		Optional<Employee> employee = service.getEmployee(id);
		return employee;
	}

	@GetMapping("/getEmployees")
	ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> allEmployees = service.getAllEmployees();
		return new ResponseEntity<List<Employee>>(allEmployees, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/deleteById/{id}")
	void deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
	}
	
 

}
