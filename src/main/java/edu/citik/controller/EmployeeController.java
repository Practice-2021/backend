package edu.citik.controller;

import edu.citik.domain.dto.EmployeeDto;
import edu.citik.service.impl.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {

	private final EmployeeService employeeService;

	@GetMapping
	public List<EmployeeDto> getAll() {
		return employeeService.findAll();
	}
}
