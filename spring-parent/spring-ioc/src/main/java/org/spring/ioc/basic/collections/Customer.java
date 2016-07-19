package org.spring.ioc.basic.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class Customer {
	
	private List<Object> myList;
	private Set<Object> mySet;
	private Map<Object,Object> myMap;
	private Properties myProperties;
	public List<Object> getMyList() {
		return myList;
	}
	public void setMyList(List<Object> myList) {
		this.myList = myList;
	}
	public Set<Object> getMySet() {
		return mySet;
	}
	public void setMySet(Set<Object> mySet) {
		this.mySet = mySet;
	}
	public Map<Object, Object> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<Object, Object> myMap) {
		this.myMap = myMap;
	}
	public Properties getMyProperties() {
		return myProperties;
	}
	public void setMyProperties(Properties myProperties) {
		this.myProperties = myProperties;
	}
	@Override
	public String toString() {
		return "Customer [myList=" + myList + ", mySet=" + mySet + ", myMap="
				+ myMap + ", myProperties=" + myProperties + "]";
	}
	
	
}
