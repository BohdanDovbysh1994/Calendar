package com.internetshop.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.internetshop.entity.Orders;
import com.internetshop.entity.User;

public interface OrdersDao {
	void save(Orders orders);
	List<Orders> finAll();
	Orders findOne(LocalDateTime date);
	void delete(LocalDateTime date);
	void update(Orders orders);
	void addUserToOrders( Orders orders, User user);

}
