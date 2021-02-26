package com.kiran.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kiran.demo.Employe;
import com.kiran.demo.dao.EmployeRepo;

@Controller
public class EmployeController {
	
	@Autowired
	EmployeRepo repo;

	@RequestMapping("/home")
	public String home() {
	
		System.out.println(repo.findByTech("java")); // Our own customised method. Method should start with findBy / getBy and the name should be any of the member variable 
		System.out.println(repo.findByName("Tanu")); // Our own customised method
		return "home.jsp";
	}
	
	
	@RequestMapping("/addEmployee")
	public String addEmploye(Employe employe) {
		repo.save(employe);
		return "home.jsp";
	}
	
	@RequestMapping("/getEmployee")
	public ModelAndView getEmploye(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("showEmploye.jsp");
		Employe emp =repo.findById(id).orElse(new Employe());  // Here we added orElse to handle the null value
		mv.addObject(emp);
		return mv;
	}
	
	@RequestMapping("/deleteEmployee")
	public String deleteEmploye(@RequestParam int id) {
				repo.deleteById(id);
		return "home.jsp";
	}
	
	@RequestMapping("/updateEmpId")
	public String updateEmploye(Employe employe) {
				repo.save(employe);
		return "home.jsp";
	}
	
	
	
	
	
}
