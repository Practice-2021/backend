package edu.citik.repository;

import java.util.List;

public interface MongoRepository<Entity> {
	void save(Entity entity);

	Entity find(String criteria, String value);

	List<Entity> findAll();

	void update(String criteria, String value, String updateCriteria, String updateValue);


	void remove(String criteria, String value);
}
