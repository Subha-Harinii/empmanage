package com.example.demo.servicelayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.empdao.EmpDao;
import com.example.demo.employee.Employee;

@Service
public class Functions 
{
	@Autowired
	EmpDao dao;
	
	public void  addEmp(Employee e) 
	{
		if(dao.existsById(e.getEid()))
			System.out.println("sorry already employee exixts with:"+e.getEid());
		else
		    dao.save(e);
	}
	
	
	public void  updateEmp(Employee e) 
	{
		if(dao.existsById(e.getEid()))
			dao.save(e);
		else
		    System.out.println("sorry employee does not exists with:"+e.getEid());
	}
	

}
