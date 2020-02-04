package com.learn.foodapp.service.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.learn.foodapp.service.RestaurantService;


@RunWith(MockitoJUnitRunner.class)
public class RestaurantServiceTest {

	@InjectMocks
	private RestaurantService restaurantService;

	@Test
	public void getAllRestaurantTest() {
		assertNotNull(restaurantService.getAllRestaurant());
	}

	@Test
	public void getAllRestaurantBasedOnRatings() {
		assertNotNull(restaurantService.getAllRestaurantBasedOnRatings());
	}
	
	@Test
	public void getAllRestaurantBasedOnOpeningAndClosingTime() {
		assertNotNull(restaurantService.getAllRestaurantBasedOnOpeningAndClosingTime());
	}
	

}
