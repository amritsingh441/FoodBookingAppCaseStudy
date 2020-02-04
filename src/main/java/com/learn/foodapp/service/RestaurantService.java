package com.learn.foodapp.service;

import java.util.List;

import com.learn.foodapp.model.Restaurant;
import com.learn.foodapp.repository.RestaurantRepository;


public class RestaurantService {

	private static final String ALL_RESTAURANT_OUTPUT_FILE = "AllRestaurant.txt";
	private static final String ALL_RESTAURANT_RATING_BASED_OUTPUT_FILE = "AllRestaurantBasedOnRatings.txt";
	private static final String ALL_RESTAURANT_TIME_BASED_OUTPUT_FILE = "AllRestaurantBasedOnOpeningAndClosingTime.txt";
	private RestaurantRepository repository = new RestaurantRepository();
	
	public List<Restaurant> getAllRestaurant(){
		List<Restaurant> resList = repository.getAllRestaurant();
		repository.writeData(resList.stream().map(Restaurant::toString).reduce("", String :: concat), ALL_RESTAURANT_OUTPUT_FILE);
		return resList;
	}
	
	public List<Restaurant> getAllRestaurantBasedOnRatings(){
		List<Restaurant> resList = repository.getAllRestaurantBasedOnRatings();
		repository.writeData(resList.stream().map(Restaurant::toString).reduce("", String :: concat), ALL_RESTAURANT_RATING_BASED_OUTPUT_FILE);
		return resList;
	}
	public List<Restaurant> getAllRestaurantBasedOnOpeningAndClosingTime(){
		List<Restaurant> resList = repository.getAllRestaurantBasedOnOpeningAndClosingTime();
		repository.writeData(resList.stream().map(Restaurant::toString).reduce("", String :: concat), ALL_RESTAURANT_TIME_BASED_OUTPUT_FILE);
		return resList;
	}

}
