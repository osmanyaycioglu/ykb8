package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Employee;

@Repository
public interface IEmployeeDAO extends CrudRepository<Employee, Long>{
	
	List<Employee> findBySurnameAndAge(String surname,int age);
	
	@Query(value = "select e from Employee e where e.name=:name and e.age=:age")
	List<Employee> xyzSurnameAndAge(@Param("name") String surname, @Param("age") int age);
	
	@Query(value = "select * from calisan where isim=:name and age=:age",nativeQuery = true)
	List<Employee> xyznSurnameAndAge(@Param("name") String surname, @Param("age") int age);
	
}
