package com.capgemini.manytomany.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.manytomany.dao.EmployeeDao;
import com.capgemini.manytomany.dao.ProjectDao;
import com.capgemini.manytomany.entity.Employee;
import com.capgemini.manytomany.entity.Project;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	@Autowired
	private ProjectDao dao1;



	@Override
	public Employee findPersonById(int id) {
		Employee employee= dao.findById(id).get();
		return employee;
	}

	@Override
	public void addNewEmployee(Set<Employee> employee) {
		dao.saveAll(employee);
		
	}

	@Override
	public void addNewProject(Set<Project> project) {
		dao1.saveAll(project);
	}

}
