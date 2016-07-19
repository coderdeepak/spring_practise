package org.spring.ioc.basic.idref;

public class ClientBean {
	private TargetBean targetBean;
	private String targetBeanName;
	
	public TargetBean getTargetBean() {
		return targetBean;
	}
	public void setTargetBean(TargetBean targetBean) {
		this.targetBean = targetBean;
	}
	public String getTargetBeanName() {
		return targetBeanName;
	}
	public void setTargetBeanName(String targetBeanName) {
		this.targetBeanName = targetBeanName;
	}
	
	
}
