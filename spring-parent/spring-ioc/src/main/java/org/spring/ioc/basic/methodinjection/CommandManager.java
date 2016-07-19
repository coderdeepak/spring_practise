package org.spring.ioc.basic.methodinjection;

public abstract class CommandManager {
	
	public Object process(String commandState){
		Command command = createCommand();
		command.setName(commandState);
		return command;
	}
	
	 protected abstract Command createCommand();
}
