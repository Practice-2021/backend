package edu.citik.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import edu.citik.domain.Employee;
import edu.citik.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeQuery implements GraphQLQueryResolver {
	@Autowired
	private EmployeeService employeeService;

	public List<Employee> getEmployees() {
		return employeeService.findAll();
	}

	public Employee getEmployee(Integer id) {
		return employeeService.find("id", id.toString());
	}
}
