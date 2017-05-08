package com.internetshop.daoImpl;

import com.internetshop.dao.CountryDao;
import com.internetshop.entity.Country;
import com.internetshop.entity.maker;

public class CountryDaoImpl extends GenericDaoIplementation<Country, String> implements CountryDao {

	public void addMakerToCountry(Country country, maker maker) {
		getEntityManager().getTransaction().begin();
		maker.setCountry(country);
		getEntityManager().getTransaction().commit();
		
	}

}
