package com.capgemini.manytomany.service;

import java.util.Set;

import com.capgemini.manytomany.entity.Employee;
import com.capgemini.manytomany.entity.Project;

public interface EmployeeService {
	
	public Employee findPersonById(int id);

	void addNewEmployee(Set<Employee> person);

	void addNewProject(Set<Project> project);

}
