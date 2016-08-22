package org.spring.ioc.annotations.autowire;

import org.spring.ioc.autowire.common.Department;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean {
	
	private String name;
	
	private Department departmentBean;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartmentBean() {
		return departmentBean;
	}
	
	@Autowired
	public void setDepartmentBean(Department departmentBean) {
		this.departmentBean = departmentBean;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [name=" + name + ", departmentBean="
				+ departmentBean + "]";
	}
	
	

}
