package com.example.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String empName;
	private String deptName;
	public Emp() {
		super();
	}	
	public Emp(int id, String empName, String deptName) {
		super();
		this.id = id;
		this.empName = empName;
		this.deptName = deptName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", empName=" + empName + ", deptName=" + deptName + "]";
	}
	
}
