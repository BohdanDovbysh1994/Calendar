package com.internetshop.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import com.internetshop.dao.makerDao;
import com.internetshop.entity.ComputerComodity;
import com.internetshop.entity.User;
import com.internetshop.entity.householdAppliances;
import com.internetshop.entity.maker;

public class makerDaoImpl implements makerDao {
	private final EntityManager entityManager;

	public makerDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public void save(maker maker) {
		entityManager.getTransaction().begin();

		entityManager.persist(maker);

		entityManager.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<maker> finAll() {

		entityManager.getTransaction().begin();
		List<maker> makers = entityManager.createQuery("from User").getResultList();

		entityManager.getTransaction().commit();

		return makers;
	}

	public maker findOne(String name) {
		maker maker = null;
		entityManager.getTransaction().begin();
		try {
			maker = (maker) entityManager.createQuery("select o from maker o where o.name =: value")
					.setParameter("value", name).getSingleResult();
		} catch (NoResultException e) {
			System.out.println(e.getMessage());
		} catch (NonUniqueResultException e) {
			System.out.println(e.getMessage());
		}
		entityManager.getTransaction().commit();

		return maker;
	}

	public void delete(String name) {
		maker maker = null;
		entityManager.getTransaction().begin();
		try {
			maker = (maker) entityManager.createQuery("select o from User o where o.name =: value1")
					.setParameter("value1", name).getSingleResult();
			entityManager.remove(maker);
		} catch (NoResultException e) {
			System.out.println(e.getMessage());
		} catch (NonUniqueResultException e) {
			System.out.println(e.getMessage());
		}

		entityManager.getTransaction().commit();

	}

	public void update(maker maker) {
		entityManager.getTransaction().begin();

		entityManager.merge(maker);

		entityManager.getTransaction().commit();
	}

	public void addComputerComodutyTomaker(maker maker, ComputerComodity computerComodity) {
		entityManager.getTransaction().begin();

		computerComodity.setMaker(maker);

		entityManager.getTransaction().commit();

	}

	public void addhouseholdAppTomaker(maker maker, householdAppliances householdAppliances) {
		entityManager.getTransaction().begin();
		householdAppliances.setMaker(maker);
		entityManager.getTransaction().commit();

	}

}
