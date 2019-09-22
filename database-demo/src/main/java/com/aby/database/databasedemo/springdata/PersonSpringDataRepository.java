package com.aby.database.databasedemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aby.database.databasedemo.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer>{

}
