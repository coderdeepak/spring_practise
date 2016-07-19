package org.spring.ioc.basic.collections;

public class Test {
	
	private String x;
	private String y;
	private String z;
	
	public Test(){
		System.out.println("Test object created");
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public String getZ() {
		return z;
	}

	public void setZ(String z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + ", z=" + z + ", getX()=" + getX()
				+ ", getY()=" + getY() + ", getZ()=" + getZ() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
