package com.hand.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hand.ssm.dto.City;
import com.hand.ssm.service.CityService;

@Controller
public class CityController {
	
	@Autowired
	CityService cityService;
	
	@RequestMapping("getCity.jhtml")
	public String getCity(ModelMap modelMap, String id) throws Exception {
		/*if(StringUtils.isEmpty(id))
		{
			return "";
		}*/
		int cityid = Integer.valueOf(id);
		City city = cityService.getById(cityid);
		List<City> list = new ArrayList<City>();
		list.add(city);
		modelMap.put("list", list);
		
		return "/cityList";
	}
	
	@RequestMapping("showAllCity.jhtml")
	public String showAllCity(ModelMap map)
	{
		List<City> list = cityService.getAll();
		map.put("list", list);
		return "/cityList";
	}
	
	@RequestMapping("city.jhtml")
	public String city(ModelMap modelMap)
	{
		return "/city";
	}
	
	@RequestMapping("addOrEditCity.jhtml")
	public String addOrEditCity(ModelMap map,String id)
	{	
		if(null!=id){
			City city = cityService.getById(Integer.valueOf(id));
			map.put("city", city);
		}
		
		return "/editCity";
	}
	
	@RequestMapping("addCity.jthml")
	public void addCity(HttpServletRequest request, HttpServletResponse response,City city) throws IOException
	{
		int id = cityService.saveCity(city);
		response.sendRedirect("/showAllCity.jhtml");
	}
	
	@RequestMapping("delCity.jthml")
	public void delCity(HttpServletRequest request, HttpServletResponse response,String id) throws IOException
	{
		int result = cityService.delCity(Integer.valueOf(id));
		response.sendRedirect("/showAllCity.jhtml");
	}
	
	@RequestMapping("updateCity.jthml")
	public void updateCity(HttpServletRequest request, HttpServletResponse response,City city) throws IOException{
		int r = cityService.updateCity(city);
		response.sendRedirect("/showAllCity.jhtml");
	}
}
