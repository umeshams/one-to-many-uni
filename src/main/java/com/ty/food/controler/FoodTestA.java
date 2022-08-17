package com.ty.food.controler;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;

public class FoodTestA {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	FoodOrder foodOrder=new FoodOrder();
	foodOrder.setAddress("bengalur");
	foodOrder.setCustemerName("ragila");
	foodOrder.setPhone(9740715451l);
	
	List<Item> items=new ArrayList<Item>();
	
	Item item1 =new Item();
	item1.setName("jamun");
	item1.setCost(25);
	item1.setQulity("good");
	items.add(item1);
	
	Item item2 =new Item();
	item2.setName("puliyogare");
	item2.setCost(55);
	item2.setQulity("good");
	items.add(item2);
	
	Item item3=new Item();
	item3.setName("dose");
	item3.setCost(56);
	item3.setQulity("avarage");
	items.add(item3);
	
	
	foodOrder.setItems(items);
	entityTransaction.begin();
	entityManager.persist(foodOrder);
	entityManager.persist(item1);
	entityManager.persist(item2);
	entityManager.persist(item3);
	
	entityTransaction.commit();
	System.out.println("---------data stored----------");
	
}
}
