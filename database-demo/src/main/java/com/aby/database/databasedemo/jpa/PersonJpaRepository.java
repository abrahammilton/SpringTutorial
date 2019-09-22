package com.aby.database.databasedemo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aby.database.databasedemo.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {

	//connect to DB
	//manages entities
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id){
		return entityManager.find(Person.class, id);
	}
}
