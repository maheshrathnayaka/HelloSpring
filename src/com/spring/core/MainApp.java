package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String args[]) {
		// AbstractApplicationContext
		// AbstractApplicationContext context = new
		// ClassPathXmlApplicationContext("Beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		objA.getMessage1();
		objA.getMessage2();
		HelloSL objB = (HelloSL) context.getBean("helloSL");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();

		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
		obj1.getMessage1();

		AnotherHello ah = (AnotherHello) context.getBean("anotherHello");
		ah.getAnswer();

		// Injecting inner bean
		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
		textEditor.spellCheck();
		
		// Injecting collections
		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();

		// To run init and destroy methods
		// context.registerShutdownHook();
	}
}
