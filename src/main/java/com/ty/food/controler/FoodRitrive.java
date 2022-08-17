package com.ty.food.controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;



public class FoodRitrive {
public static void main(String[] args) {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	   FoodOrder foodOrder=  entityManager.find(FoodOrder.class, 1);
	   
	   System.out.println("id is :"+foodOrder.getId());
	   System.out.println("phone number is :"+foodOrder.getPhone());
	   System.out.println("address is :"+foodOrder.getAddress());
	   System.out.println("custer name is :"+foodOrder.getCustemerName());
	   List<Item> items=foodOrder.getItems();
	   for(Item item:items) {
		   System.out.println("name is :"+item.getName());
		   System.out.println("qulity is :"+item.getQulity());
		   System.out.println("cost is :"+item.getCost());
	   }
}
}
