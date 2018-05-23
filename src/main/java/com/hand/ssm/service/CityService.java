package com.hand.ssm.service;

import java.util.List;

import com.hand.ssm.dto.City;

public interface CityService {
	City getById(int id);
	
	int delCity(int id);
	
	int updateCity(City city);
	
	List<City> getAll();
	
	int saveCity(City city);
	
}
