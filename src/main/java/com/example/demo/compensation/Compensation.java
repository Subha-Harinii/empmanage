package com.example.demo.compensation;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Compensation 
{
	@Id
	private int cid;
	private int eid;
	private String type;
	private int amount;
	private String description;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date s_date;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date e_date;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getS_date() {
		return s_date;
	}
	public void setS_date(Date s_date) {
		this.s_date = s_date;
	}
	public Date getE_date() {
		return e_date;
	}
	public void setE_date(Date e_date) {
		this.e_date = e_date;
	}
	@Override
	public String toString() {
		return "Compensation [cid=" + cid + ", eid=" + eid + ", type=" + type + ", amount=" + amount + ", description="
				+ description + ", s_date=" + s_date + ", e_date=" + e_date + "]";
	}
	
	
	

}
