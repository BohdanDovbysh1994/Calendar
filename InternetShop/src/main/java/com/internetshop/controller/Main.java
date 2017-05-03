package com.internetshop.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.internetshop.entity.User;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		User user = new User();
		manager.persist(user);


		manager.close();
		factory.close();

	}

}
