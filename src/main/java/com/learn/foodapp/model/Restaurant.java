package com.learn.foodapp.model;

import java.time.LocalTime;
import java.util.List;

public class Restaurant {
	
	private Integer restaurantId;
	private String restaurantName;
	private Double ratings;
	private LocalTime openingTime;
	private LocalTime closingTime;
	private List<Review> reviews;
	private List<Dishes> dishes;
	
	public Restaurant(Integer restaurantId, String restaurantName, Double ratings, LocalTime openingTime,
			LocalTime closingTime, List<Review> reviews, List<Dishes> dishes) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.ratings = ratings;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.reviews = reviews;
		this.dishes = dishes;
	}
	
	
	public Integer getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public Double getRatings() {
		return ratings;
	}
	public void setRatings(Double ratings) {
		this.ratings = ratings;
	}
	public LocalTime getOpeningTime() {
		return openingTime;
	}
	public void setOpeningTime(LocalTime openingTime) {
		this.openingTime = openingTime;
	}
	public LocalTime getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	public List<Dishes> getDishes() {
		return dishes;
	}
	public void setDishes(List<Dishes> dishes) {
		this.dishes = dishes;
	}


	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", ratings="
				+ ratings + ", openingTime=" + openingTime + ", closingTime=" + closingTime + ", reviews=" + reviews
				+ ", dishes=" + dishes + "]";
	}
	
	

}
