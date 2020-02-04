package com.learn.foodapp.repository;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.learn.foodapp.model.Dishes;
import com.learn.foodapp.model.Restaurant;
import com.learn.foodapp.model.Review;

public class RestaurantRepository {

	private static final Logger logger = LoggerFactory.getLogger(RestaurantRepository.class);
	private static final String RESTAURANT_FILE_NAME = "Restaurant.txt";
	private static final String REVIEW_FILE_NAME = "Review.txt";
	private static final String DISHES_FILE_NAME = "Dishes.txt";
	private static final String FILE_PATH = "src/data";
	
	public List<Restaurant> getAllRestaurant(){
		return getRestaurantFileData();
	}

	public List<Restaurant> getAllRestaurantBasedOnRatings(){
		return getRestaurantFileData().stream().filter(res -> res.getRatings() < 4).collect(Collectors.toList());
	}

	public List<Restaurant> getAllRestaurantBasedOnOpeningAndClosingTime(){
		return getRestaurantFileData().stream().filter(res -> res.getOpeningTime().isBefore(LocalTime.now())  
				&& res.getClosingTime().isAfter(LocalTime.now())).collect(Collectors.toList());
	}

	public List<Restaurant> getRestaurantFileData(){
		logger.debug("inside getAllRestaurant method....");
		List<Restaurant> restaurantList = new ArrayList<>();
		try(Stream<String> restaurantFileData = Files.newBufferedReader(Paths.get(FILE_PATH,RESTAURANT_FILE_NAME)).lines()){
			List<String []> records = restaurantFileData.map(input ->input.split(",")).collect(Collectors.toList());
			for (int i = 0; i < records.size(); i++) {
				Integer resId = Integer.parseInt(records.get(i)[0]);
				restaurantList.add(new Restaurant(resId, records.get(i)[1], Double.parseDouble(records.get(i)[2]),
						LocalTime.parse(records.get(i)[3]), LocalTime.parse(records.get(i)[4]), 
						getReviewFileData().stream().filter(r -> r.getRestaurantId().equals(resId)).collect(Collectors.toList()), 
						getDishesFileData().stream().filter(d -> d.getRestaurantId().equals(resId)).collect(Collectors.toList())));
			}
			logger.debug("End of try block in getAllRestaurant method");
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}
		return restaurantList;
	}



	public List<Review> getReviewFileData() {
		logger.debug("inside getReviewFileData method....");
		List<Review> reviewList = new ArrayList<>();
		try(Stream<String> reviewFileData = Files.newBufferedReader(Paths.get(FILE_PATH,REVIEW_FILE_NAME)).lines()){
			List<String []> reviewRecords = reviewFileData.map(input ->input.split(",")).collect(Collectors.toList());
			for (int i = 0; i < reviewRecords.size(); i++) {
				reviewList.add(new Review(Integer.parseInt(reviewRecords.get(i)[0]), reviewRecords.get(i)[1]));
			}
			logger.debug("End of try block in getReviewFileData method");
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}
		return reviewList;

	}

	public List<Dishes> getDishesFileData() {
		logger.debug("inside getDishesFileData method....");
		List<Dishes> dishesList = new ArrayList<>();
		try(Stream<String> dishesFileData = Files.newBufferedReader(Paths.get(FILE_PATH,DISHES_FILE_NAME)).lines()){
			List<String []> dishesRecords = dishesFileData.map(input ->input.split(",")).collect(Collectors.toList());
			for (int i = 0; i < dishesRecords.size(); i++) {
				dishesList.add(new Dishes(Integer.parseInt(dishesRecords.get(i)[0]), dishesRecords.get(i)[1],Integer.parseInt(dishesRecords.get(i)[2]),Integer.parseInt(dishesRecords.get(i)[2])));
			}
			logger.debug("End of try block in getDishesFileData method");
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}
		return dishesList;

	}
	
	public  void writeData(String data,String fileName) {
		
		try(BufferedWriter br = Files.newBufferedWriter(Paths.get(FILE_PATH,fileName), StandardOpenOption.APPEND))
		{
			br.newLine();
			br.write(data);
			
		}catch(IOException ioe) {
			logger.debug(ioe.getMessage());
			
		}
		
	}

}
