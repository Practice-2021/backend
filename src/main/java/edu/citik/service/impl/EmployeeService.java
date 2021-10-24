package edu.citik.service.impl;

import edu.citik.domain.Employee;
import edu.citik.repository.impl.EmployeeRepository;
import edu.citik.service.BackendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements BackendService<Employee> {
	@Autowired
	private EmployeeRepository repository;

	@Override
	public void save(Employee employee) {
		repository.save(employee);
	}

	@Override
	public Employee find(String criteria, String value) {
		return repository.find(criteria, value);
	}

	@Override
	public List<Employee> findAll() {
		return repository.findAll();
	}

	@Override
	public void update(String criteria, String value, String updateCriteria, String updateValue) {
		repository.update(criteria, value, updateCriteria, updateValue);
	}

	@Override
	public void remove(String criteria, String value) {
		repository.remove(criteria, value);
	}
}
