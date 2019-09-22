package com.aby.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aby.database.databasedemo.jpa.PersonJpaRepository;

//@SpringBootApplication
public class SpringJpaDemoApplication implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(SpringJpaDemoApplication.class);

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//log.info("List of all users -> {}", dao.findAll());
		log.info("User Id 10001 -> {}", repository.findById(10001));
		//log.info("delete user Id 10003 -> {}", dao.deleteById(10003));

	}

}
