package com.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jboss.jandex.Main;

public class Driver 
{
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		System.out.println(emf);
	}

}
