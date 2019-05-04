package com.capgemini.manytomany.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Project {

	@Id
	private int projectId;
	private String projectName;
	
	@ManyToMany
	@JoinTable(name="employee_project",joinColumns=@JoinColumn(name = "projectId"),inverseJoinColumns=@JoinColumn(name = "employeeId"))
	private Set<Employee> employee;
	
	public Project() {
		super();
	}

	
	public Project(int projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}


	public int getProjectId() {
		return projectId;
	}


	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


//	public Set<Employee> getEmployee() {
//		return employee;
//	}


	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "project [projectId=" + projectId + ", projectName=" + projectName + "]";
	}


	



	
	
}

