package com.helloworld.demo.services;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import com.helloworld.demo.configuration.MongoConfiguration;

public class MongoService {
	private MongoOperations mongoOperation;
	
	public MongoService() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfiguration.class);
	    mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
	}

	//TODO Generar Metodos CRUD

}
