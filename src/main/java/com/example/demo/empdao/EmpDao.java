package com.example.demo.empdao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.employee.Employee;

public interface EmpDao extends JpaRepository<Employee,Integer>{

}
