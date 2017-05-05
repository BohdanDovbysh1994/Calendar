package com.internetshop.daoImpl;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import com.internetshop.dao.OrdersDao;
import com.internetshop.entity.Orders;
import com.internetshop.entity.User;

public class OrdersDaoImpl implements OrdersDao {
	private final EntityManager entityManager;

	public OrdersDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public void save(Orders orders) {
		entityManager.getTransaction().begin();

		entityManager.persist(orders);

		entityManager.getTransaction().commit();

	}

	@SuppressWarnings("unchecked")
	public List<Orders> finAll() {
		entityManager.getTransaction().begin();
		List<Orders> orders = entityManager.createQuery("from Orders").getResultList();

		entityManager.getTransaction().commit();

		return orders;
	}

	public Orders findOne(LocalDateTime date) {
		Orders order = null;

		entityManager.getTransaction().begin();
		try {
			order = (Orders) entityManager.createQuery("select o from Orders o where o.date =: value")
					.setParameter("value", date).getSingleResult();
		} catch (NoResultException e) {
			System.out.println(e.getMessage());
		} catch (NonUniqueResultException e) {
			System.out.println(e.getMessage());
		}
		entityManager.getTransaction().commit();

		return order;
	}

	public void delete(LocalDateTime date) {
		Orders orders = null;
		entityManager.getTransaction().begin();
		try {
			orders = (Orders) entityManager.createQuery("select o from User o where o.name =: value1")
					.setParameter("value1", date).getSingleResult();
			entityManager.remove(orders);
		} catch (NoResultException e) {
			System.out.println(e.getMessage());
		} catch (NonUniqueResultException e) {
			System.out.println(e.getMessage());
		}

		entityManager.getTransaction().commit();

	}

	public void update(Orders orders) {
		entityManager.getTransaction().begin();

		entityManager.merge(orders);

		entityManager.getTransaction().commit();

	}

	public void addUserToOrders(Orders orders, User user) {
		entityManager.getTransaction().begin();

		orders.setUser(user);

		entityManager.getTransaction().commit();

	}

}
