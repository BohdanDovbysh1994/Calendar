package com.internetshop.dao;

import java.util.List;

import com.internetshop.entity.ComputerComodity;
import com.internetshop.entity.Country;
import com.internetshop.entity.householdAppliances;
import com.internetshop.entity.maker;

public interface makerDao {
	void save(maker maker);
	List<maker> finAll();
	maker findOne(String name);
	void delete(String name);
	void update(maker maker);
	void addComputerComodutyTomaker(maker maker, ComputerComodity computerComodity);
	void addhouseholdAppTomaker(maker maker , householdAppliances householdAppliances);

}
