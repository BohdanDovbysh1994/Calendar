package com.internetshop.dao;

import java.util.List;

import com.internetshop.entity.Orders;
import com.internetshop.entity.User;

public interface UserDao {
	void addOrdersToUser(User user, Orders orders);

}
