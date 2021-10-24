package edu.citik.repository.impl;

import edu.citik.domain.Employee;
import edu.citik.repository.MongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeRepository implements MongoRepository<Employee> {
	@Autowired
	private MongoOperations mongoOperation;

	@Override
	public void save(Employee employee) {
		mongoOperation.save(employee);
	}

	@Override
	public Employee find(String criteria, String value) {
		Query searchEmployee = new Query(Criteria.where(criteria).is(value));
		return mongoOperation.findOne(searchEmployee, Employee.class);
	}

	@Override
	public void update(String criteria, String value, String updateCriteria, String updateValue) {
		Query searchEmployee = new Query(Criteria.where(criteria).is(value));
		mongoOperation.updateFirst(searchEmployee, Update.update(updateCriteria, updateValue),
				Employee.class);
	}

	@Override
	public List<Employee> findAll() {
		return mongoOperation.findAll(Employee.class);
	}

	@Override
	public void remove(String criteria, String value) {
		Query searchEmployee = new Query(Criteria.where(criteria).is(value));
		mongoOperation.remove(searchEmployee, Employee.class);
	}
}