package com.internetshop.dao;


import com.internetshop.entity.Orders;
import com.internetshop.entity.User;

public interface OrdersDao {

	void addUserToOrders( Orders orders, User user);

}
