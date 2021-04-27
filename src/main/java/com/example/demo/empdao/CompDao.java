package com.example.demo.empdao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;

import com.example.demo.compensation.Compensation;

public interface CompDao extends JpaRepository<Compensation, Integer>{
	
	@Query("from Compensation where  s_date=?1 and e_date=?1" )
	public List<Compensation> myOwnQuery(@DateTimeFormat(pattern="yyyy-mm-dd")Date s_date,@DateTimeFormat(pattern="yyyy-mm-dd")Date e_date);

}
