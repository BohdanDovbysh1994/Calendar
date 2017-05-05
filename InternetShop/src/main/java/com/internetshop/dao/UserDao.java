package com.internetshop.dao;

import java.util.List;

import com.internetshop.entity.Orders;
import com.internetshop.entity.User;

public interface UserDao {
	void save(User user);
	List<User> finAll();
	User findOne(String name);
	void delete(String name, String email);
	void update(User user);
	void addOrdersToUser(User user, Orders orders);

}
