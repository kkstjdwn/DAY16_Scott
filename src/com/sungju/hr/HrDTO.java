package com.sungju.hr;

import java.sql.Date;

public class HrDTO {
	
	private int empId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hierdate;
	private String jobId;
	private int salary;
	private double commPct;
	private int managerId;
	private int deptId;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHierdate() {
		return hierdate;
	}
	public void setHierdate(Date hierdate) {
		this.hierdate = hierdate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getCommPct() {
		return commPct;
	}
	public void setCommPct(double commPct) {
		this.commPct = commPct;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

}
