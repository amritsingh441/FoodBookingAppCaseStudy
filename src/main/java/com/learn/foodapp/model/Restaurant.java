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
	
	
	
	public Double getRatings() {
		return ratings;
	}
	
	public LocalTime getOpeningTime() {
		return openingTime;
	}
	
	public LocalTime getClosingTime() {
		return closingTime;
	}
	

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", ratings="
				+ ratings + ", openingTime=" + openingTime + ", closingTime=" + closingTime + ", reviews=" + reviews
				+ ", dishes=" + dishes + "]";
	}
	
	

}
