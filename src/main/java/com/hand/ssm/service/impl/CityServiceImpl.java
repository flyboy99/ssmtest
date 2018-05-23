package com.hand.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.ssm.dao.CityMapper;
import com.hand.ssm.dto.City;
import com.hand.ssm.service.CityService;

@Service("cityService")
public class CityServiceImpl implements CityService {
	
	@Autowired
	public CityMapper cityMapper;
	
	@Override
	public City getById(int id) {
		
		return cityMapper.selectByPrimaryKey(id);
	}

	@Override
	public int delCity(int id) {
		
		return cityMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateCity(City city) {
		return cityMapper.updateByPrimaryKey(city);
	}

	@Override
	public List<City> getAll() {
		return cityMapper.getAll();
	}

	@Override
	public int saveCity(City city) {
		// TODO Auto-generated method stub
		return cityMapper.insert(city);
	}

}
