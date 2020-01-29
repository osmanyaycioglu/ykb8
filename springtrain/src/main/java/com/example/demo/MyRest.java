package com.example.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.websocket.server.PathParam;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class MyRest {

	@GetMapping(path = "/hello")
	public String hello() {
		return "Hello world";
	}

	@GetMapping(path = "/hello2")
	public String hello2() {
		return "Hello world 2";
	}

	@PostMapping(path = "/hello2")
	public String hello3() {
		return "Hello world 3";
	}

	@GetMapping(path = "/hello4/{isim}/{soyisim}")
	public String hello4(@PathVariable("isim") String name,@PathVariable("soyisim") String surname) {
		return "Hello world " + name  + " " + surname;
	}

	@GetMapping(path = "/hello5/{isim}/{soyisim}")
	public String hello5(@PathVariable("isim") String name
						,@PathVariable("soyisim") String surname
						,@RequestParam("yas") int age
						,@RequestHeader("boy")int height ) {
		return "Hello world " + name  + " " + surname + " " + age + " " + height;
	}

	@GetMapping(path = "/hello6/{isim}/{soyisim}"
			,produces = {MediaType.APPLICATION_XML_VALUE,
						MediaType.APPLICATION_JSON_VALUE})
	public Employee hello6(@PathVariable("isim") String name
						,@PathVariable("soyisim") String surname
						,@RequestParam("yas") int age
						,@RequestHeader("boy")int height ) {
		Employee employee = new Employee();
		employee.setAge(age);
		employee.setBoy(height);
		employee.setName(name);
		employee.setSurname(surname);
		return employee;
	}
	
	@PostMapping(path = "/hello7"
			,produces = {MediaType.APPLICATION_XML_VALUE,
						MediaType.APPLICATION_JSON_VALUE}
			,consumes = {MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE})
	public Employee hello7(@Validated @RequestBody Employee emp) {
		Employee employee = new Employee();
		employee.setAge(emp.getAge() + 5);
		employee.setBoy(emp.getBoy() + 10);
		employee.setName(emp.getName());
		employee.setSurname(emp.getSurname());
		
		Gson gson = new Gson();
		String json = gson.toJson(emp);
		System.out.println(json);

		try {
			Files.write(Paths.get("employee.json"), 
						json.getBytes(), 
						StandardOpenOption.CREATE);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return employee;
	}

}
