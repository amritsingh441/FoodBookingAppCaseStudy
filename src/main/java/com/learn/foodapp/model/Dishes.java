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
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "Dishes [restaurantId=" + restaurantId + ", dishName=" + dishName + ", price=" + price + ", discount="
				+ discount + "]";
	}
	
}
