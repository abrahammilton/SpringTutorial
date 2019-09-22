package com.aby.database.databasedemo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.aby.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDAO {
	
	@Autowired
	JdbcTemplate connecton;
	
	class PersonRowMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {

			Person person = new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			person.setBirthdate(rs.getTimestamp("birth_date"));
			return person;
		}
		
	}

	//select * from person
	public List<Person> findAll(){
		return connecton.query("select * from person", 
				new PersonRowMapper());
	}
	
	public Person findById(int id){
		return connecton.queryForObject("select * from person where id=?", new Object[] {id}, 
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public int deleteById(int id){
		return connecton.update("delete from person where id=?", new Object[] {id}) ;
	}
}
