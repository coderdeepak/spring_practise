package org.spring.ioc.annotations.resource;
public class Company {
	private String compName;

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	@Override
	public String toString() {
		return "Company [compName=" + compName + "]";
	}
}
