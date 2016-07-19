package org.spring.ioc.basic.collections.strongtype;

import java.util.Map;

public class Foo {
	
	private Map<String,Integer> accounts;

	public Map<String, Integer> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<String, Integer> accounts) {
		this.accounts = accounts;
	}
}
