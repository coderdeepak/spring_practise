package org.spring.ioc.basic.constructorinjection;

import org.spring.ioc.common.IOutputGenerator;

public class OutputHelper {
	
	private IOutputGenerator outputGenerator;

	public OutputHelper(IOutputGenerator outputGenerator) {
		super();
		this.outputGenerator = outputGenerator;
	}
	
	

	public IOutputGenerator getOutputGenerator() {
		return outputGenerator;
	}
	/*
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
*/}
