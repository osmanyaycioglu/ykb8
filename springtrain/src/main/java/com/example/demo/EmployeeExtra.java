package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class EmployeeExtra {
	
	@Id
	@GeneratedValue
	private long eeId;
	
	private String address;
	private int maas;
	
	@OneToOne
	@XmlTransient
	@JsonIgnore
	private Employee employee;
	
	public long getEeId() {
		return eeId;
	}
	public void setEeId(long eeId) {
		this.eeId = eeId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
