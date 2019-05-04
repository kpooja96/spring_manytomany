package com.capgemini.manytomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.manytomany.entity.Employee;
import com.capgemini.manytomany.entity.Project;
import com.capgemini.manytomany.service.EmployeeService;

@RestController
public class Controller {
	
	@Autowired
	EmployeeService service;

	@RequestMapping("/")
	public void add() {
		Set<Employee> employee1 = new HashSet<Employee>();
		Set<Employee> employee2 = new HashSet<Employee>();
		Set<Employee> employee3 = new HashSet<Employee>();

		Set<Project> project1 = new HashSet<Project>();
		Set<Project> project2 = new HashSet<Project>();
		Set<Project> project3 = new HashSet<Project>();

		Project prj1 = new Project(101, "AWS");
		Project prj2 = new Project(102, "JAVA");
		Project prj3 = new Project(103, "Python");

		Employee emp1 = new Employee(10, "AMD");
		Employee emp2 = new Employee(11, "RAM");
		Employee emp3 = new Employee(12, "YAYA");

		employee1.add(emp1);
		employee1.add(emp2);
		employee2.add(emp3);
		employee3.add(emp1);

		prj1.setEmployee(employee1);
		prj2.setEmployee(employee2);
		prj3.setEmployee(employee3);

		project1.add(prj1);
		project1.add(prj3);
		project2.add(prj1);
		project3.add(prj2);

		service.addNewEmployee(employee1);
		service.addNewEmployee(employee2);
		service.addNewEmployee(employee3);

		service.addNewProject(project1);
		service.addNewProject(project2);
		service.addNewProject(project3);

	}

	@RequestMapping("/new")
	public Set<Employee> getEmployee() {
		Set<Employee> employee = new HashSet<Employee>();
		for (int i = 10; i < 13; i++) {
			employee.add(service.findPersonById(i));
		}
		return employee;
	}
}

