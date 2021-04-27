package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.empdao.EmpDao;
import com.example.demo.employee.Employee;
import com.example.demo.servicelayer.Functions;


@Controller
public class EmpController 
{
	@Autowired
	Functions service;
	
	@Autowired
	EmpDao dao;
	

	@RequestMapping("/")
	public String loginPage()
	{
		return "login.html";
		
	}
	
	@RequestMapping("/validate")
	public String validateUser(String uname,String pwd)
	{
		if(uname.equals("hrmanager") && pwd.equals("hr123") )
		{
			return "home.html";
		}
		else
		{
			return "invalid.html";
		}	
		
	}
	
	@RequestMapping("/home")
	public String homePage()
	{
		return "home.html";
		
	}
	
	@RequestMapping("/insertemp")
	public String insertEmployee(Employee e)
	{
		service.addEmp(e);
		return "home.html";
	}
	
	
	@RequestMapping("/displayemp")
	@ResponseBody
	public Optional<Employee> showEmployee(int id)
	{
		return dao.findById(id);
	}
	
	
	@RequestMapping("/updateemp")
	public String updateEmployee(Employee e)
	{
		service.updateEmp(e);
		return "home.html";
	}
	
	
	
	
}
