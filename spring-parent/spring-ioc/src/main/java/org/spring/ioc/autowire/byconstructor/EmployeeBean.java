package org.spring.ioc.autowire.byconstructor;

import org.spring.ioc.autowire.common.Department;

public class EmployeeBean {
	
	private String name;
	
	private Department department;

	public EmployeeBean(Department department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	/*public void setDepartment(Department department) {
		this.department = department;
	}*/
	
	@Override
	public String toString() {
		return "EmployeeBean [name=" + name + ", departmentBean="
				+ department + "]";
	}

}
