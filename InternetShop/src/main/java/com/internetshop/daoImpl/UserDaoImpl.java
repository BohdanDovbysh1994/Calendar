package com.internetshop.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import com.internetshop.dao.UserDao;
import com.internetshop.entity.Orders;
import com.internetshop.entity.User;

public class UserDaoImpl implements UserDao {
	private final EntityManager entityManager;

	public UserDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public void save(User user) {
		entityManager.getTransaction().begin();

		entityManager.persist(user);

		entityManager.getTransaction().commit();

	}

	@SuppressWarnings("unchecked")
	public List<User> finAll() {

		entityManager.getTransaction().begin();
		List<User> users = entityManager.createQuery("from User").getResultList();

		entityManager.getTransaction().commit();

		return users;
	}

	public User findOne(String name) {
		User user = null;

		entityManager.getTransaction().begin();
		try {
			user = (User) entityManager.createQuery("select o from User o where o.name =: value")
					.setParameter("value", name).getSingleResult();
		} catch (NoResultException e) {
			System.out.println(e.getMessage());
		} catch (NonUniqueResultException e) {
			System.out.println(e.getMessage());
		}
		entityManager.getTransaction().commit();

		return user;
	}

	public void delete(String name, String email) {
		User user = null;
		entityManager.getTransaction().begin();
		try {
			user = (User) entityManager.createQuery("select o from User o where o.name =: value1 and o.email =: value2")
					.setParameter("value1", name).setParameter("value2", email).getSingleResult();
			entityManager.remove(user);
		} catch (NoResultException e) {
			System.out.println(e.getMessage());
		} catch (NonUniqueResultException e) {
			System.out.println(e.getMessage());
		}

		entityManager.getTransaction().commit();

	}

	public void update(User user) {
		entityManager.getTransaction().begin();

		entityManager.merge(user);

		entityManager.getTransaction().commit();

	}

	public void addOrdersToUser(User user, Orders orders) {
	
		entityManager.getTransaction().begin();
		
		orders.setUser(user);
		
		entityManager.getTransaction().commit();
		

	}

}
