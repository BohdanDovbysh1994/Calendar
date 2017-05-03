package com.internetshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ComputerComodity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int price;
	private String brend;
	private String model;
	private int number;
	public ComputerComodity(int price, String brend, String model, int number) {
		super();
		this.price = price;
		this.brend = brend;
		this.model = model;
		this.number = number;
	}

	
	public ComputerComodity() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}


	public String getBrend() {
		return brend;
	}


	public void setBrend(String brend) {
		this.brend = brend;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	

}
