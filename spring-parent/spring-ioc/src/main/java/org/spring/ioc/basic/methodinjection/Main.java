package org.spring.ioc.basic.methodinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext conext = new ClassPathXmlApplicationContext("method-injection/method-injection.xml");
		CommandManager manager = conext.getBean("command_manager",CommandManager.class);
		manager.process("start command");
		manager.process("execute command");
		manager.process("stop command");

	}

}
