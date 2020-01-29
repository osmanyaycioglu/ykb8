package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "calisan")
public class Employee {
	
	@Id
	@GeneratedValue
	private long empId;
	
	// @Size(max = 50,min = 2,message = "yemek saati")
	@Column(name = "isim",length = 100)
	private String name;
	@Size(max = 50,min = 3)
	private String surname;
	@Max(120)
	@Min(10)
	private int age;
	@Max(250)
	@Min(50)
	private int boy;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new Date();
	
	@Enumerated(EnumType.ORDINAL)
	private EEmployeeType eEmployeeType = EEmployeeType.AMALE;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBoy() {
		return boy;
	}
	public void setBoy(int boy) {
		this.boy = boy;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public EEmployeeType geteEmployeeType() {
		return eEmployeeType;
	}
	public void seteEmployeeType(EEmployeeType eEmployeeType) {
		this.eEmployeeType = eEmployeeType;
	}
	
	
	

}
