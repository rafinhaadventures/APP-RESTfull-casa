package com.helloworld.demo.services;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.helloworld.demo.configuration.MongoConfiguration;

public class MongoService {
	static {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfiguration.class);
	    mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
	}
	private static MongoOperations mongoOperation;

	//TODO Generar Metodos CRUD - con el modelo de datos
	
	public static void create(Object s) {
		mongoOperation.save(s);
	}
	
	public static void read(Object s) {
		Query query = new Query();
		query.addCriteria(Criteria.where("clave").in("valor"));
		mongoOperation.find(query, null //modelo de datos);
	}

}
