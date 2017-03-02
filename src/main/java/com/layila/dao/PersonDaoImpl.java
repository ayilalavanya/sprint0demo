package com.layila.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.layila.model.Person;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		Session session;
		try{
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		return session;
    }

	/*public void save(Person person) {
		getSession().save(person);
	}

	public void update(Person person) {
		getSession().saveOrUpdate(person);
	}

	public void delete(Person person) {
		getSession().delete(person);
	}*/

	@Transactional
	public List<Person> getAllPersons() {
		List<Person> persons = getSession().createCriteria(Person.class).list();
		return persons;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
