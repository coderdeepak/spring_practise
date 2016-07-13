package org.spring.ioc.basic.factorymethod.instance;

import org.spring.ioc.basic.factorymethod.Department;

public class DepartmentFactory {

	private Department departement = null;

	public Department getDepartment(String departmentType) {
		Department department = null;
		if ("admin".equals(departmentType)) {
			department = new Department();
			department.setId(1);
			department.setName("Admin");
		} else if ("HR".equals(departmentType)) {
			department = new Department();
			department.setId(2);
			department.setName("Human Resource");
		} else if ("finance".equals(departmentType)) {
			department = new Department();
			department.setId(1);
			department.setName("Finance");
		}
		return department;
	}
}
