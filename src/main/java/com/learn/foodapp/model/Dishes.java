package com.learn.foodapp.model;

public class Dishes {
	
	private Integer restaurantId;
	private String dishName;
	private Integer price;
	private Integer discount;
	
	
	public Dishes(Integer restaurantId, String dishName, Integer price, Integer discount) {
		super();
		this.restaurantId = restaurantId;
		this.dishName = dishName;
		this.price = price;
		this.discount = discount;
	}
	
	
	public Integer getRestaurantId() {
		return restaurantId;
	}
	
	
	@Override
	public String toString() {
		return "Dishes [restaurantId=" + restaurantId + ", dishName=" + dishName + ", price=" + price + ", discount="
				+ discount + "]";
	}
	
}
