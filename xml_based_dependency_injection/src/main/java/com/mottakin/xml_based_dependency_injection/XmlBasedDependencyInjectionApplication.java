package com.mottakin.xml_based_dependency_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication

public class XmlBasedDependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlBasedDependencyInjectionApplication.class, args);
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Player p = (Player) ac.getBean("player");
	}

}
