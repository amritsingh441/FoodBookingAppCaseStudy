package com.learn.foodapp.model;


public class Review {
	
	private Integer restaurantId;
	private String reviews;
	
	public Review(Integer restaurantId, String reviews) {
		super();
		this.restaurantId = restaurantId;
		this.reviews = reviews;
	}
	
	public Integer getRestaurantId() {
		return restaurantId;
	}
	

	@Override
	public String toString() {
		return "Review [restaurantId=" + restaurantId + ", reviews=" + reviews + "]";
	}
	
	

}
