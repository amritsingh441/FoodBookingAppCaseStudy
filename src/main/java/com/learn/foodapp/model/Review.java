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
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Review [restaurantId=" + restaurantId + ", reviews=" + reviews + "]";
	}
	
	

}
