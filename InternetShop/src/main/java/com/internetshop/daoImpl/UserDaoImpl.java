package com.internetshop.daoImpl;
import com.internetshop.dao.UserDao;
import com.internetshop.entity.Orders;
import com.internetshop.entity.User;

public class UserDaoImpl extends GenericDaoIplementation<User, String> implements UserDao {

	public UserDaoImpl() {
		super();
	}

	public void addOrdersToUser(User user, Orders orders) {
	
		getEntityManager().getTransaction().begin();
		
		orders.setUser(user);
		
		getEntityManager().getTransaction().commit();
		

	}

}
