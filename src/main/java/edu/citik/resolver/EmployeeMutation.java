package edu.citik.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import edu.citik.domain.Employee;
import edu.citik.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMutation implements GraphQLMutationResolver {
	@Autowired
	private EmployeeService employeeService;

	public void createEmployee(String type) {
		this.employeeService.save(new Employee());
	}
}
