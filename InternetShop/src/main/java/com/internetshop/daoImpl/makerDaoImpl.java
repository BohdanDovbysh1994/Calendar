package com.internetshop.daoImpl;
import com.internetshop.dao.makerDao;
import com.internetshop.entity.ComputerComodity;
import com.internetshop.entity.Country;
import com.internetshop.entity.householdAppliances;
import com.internetshop.entity.maker;

public class makerDaoImpl extends GenericDaoIplementation<maker, String> implements makerDao {


	public makerDaoImpl() {
	}


	public void addComputerComodutyTomaker(maker maker, ComputerComodity computerComodity) {
		getEntityManager().getTransaction().begin();

		computerComodity.setMaker(maker);

		getEntityManager().getTransaction().commit();

	}

	public void addhouseholdAppTomaker(maker maker, householdAppliances householdAppliances) {
		getEntityManager().getTransaction().begin();
		householdAppliances.setMaker(maker);
		getEntityManager().getTransaction().commit();

	}


	public void addCountryToMaker(Country country, maker maker) {
		getEntityManager().getTransaction().begin();
		maker.setCountry(country);
		getEntityManager().getTransaction().commit();
		
	}

}
