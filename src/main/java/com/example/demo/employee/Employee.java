package com.example.demo.employee;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import oracle.sql.DATE;

@Entity
public class Employee 
{
	@Id
	private int eid;
	private String first_name;
	private String middle_name;
	private String last_name;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date dob;
	private String position;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", first_name=" + first_name + ", middle_name=" + middle_name + ", last_name="
				+ last_name + ", dob=" + dob + ", position=" + position + "]";
	}
	
	
	
	
	

}
