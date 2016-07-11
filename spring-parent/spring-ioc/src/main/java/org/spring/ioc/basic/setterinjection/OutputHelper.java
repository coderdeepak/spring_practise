package org.spring.ioc.basic.setterinjection;

import org.spring.ioc.common.IOutputGenerator;

public class OutputHelper {
	
	IOutputGenerator outputGenerator;

	public IOutputGenerator getOutputGenerator() {
		return outputGenerator;
	}

	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}
