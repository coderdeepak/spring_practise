package org.spring.ioc.autowire.exclude;

import org.spring.ioc.autowire.common.Department;

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
	
	/* derived name of the setter method 
	 * (remove set (DepartmentBean) and lower case first alphabet (departmentBean)) 
	 * should match with the name of the bean defined in configuration file (xml).
	 * 
	 */
	public void setDepartmentBean(Department departmentBean) {
		this.departmentBean = departmentBean;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [name=" + name + ", departmentBean="
				+ departmentBean + "]";
	}
	
	

}
