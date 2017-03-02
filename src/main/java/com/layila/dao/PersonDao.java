package com.layila.dao;

import java.util.List;

import com.layila.model.Person;

public interface PersonDao {
	
	/*public void save(Person person);
	public void update(Person person);
	public void delete(Person person);*/
	public List<Person> getAllPersons();

}
