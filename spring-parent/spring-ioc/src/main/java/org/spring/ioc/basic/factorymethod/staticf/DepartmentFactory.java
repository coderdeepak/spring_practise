package org.spring.ioc.basic.factorymethod.staticf;

import org.spring.ioc.basic.factorymethod.Department;

/**
 * This class is responsible of creating department object based on DepartmentType
 * @author Deepak.Keswani
 *
 */
public class DepartmentFactory {
	public static Department createDepartment(String departmentType){
		Department department=null;
		if("admin".equals(departmentType)){
			department=new Department();
			department.setId(1);
			department.setName("Admin");
		}else if("HR".equals(departmentType)){
			department=new Department();
			department.setId(2);
			department.setName("Human Resource");
		}else if("finance".equals(departmentType)){
			department=new Department();
			department.setId(1);
			department.setName("Finance");
		}
		return department;
	}
}
