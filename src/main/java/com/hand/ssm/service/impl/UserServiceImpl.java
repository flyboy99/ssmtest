package com.hand.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.ssm.dao.UserDao;
import com.hand.ssm.dto.User;
import com.hand.ssm.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserDao userDao;
	
	public int addUser(User user) {
		int result=userDao.addUser(user);
        return result;
	}

	public int deleteUser(Integer id) {
		int result=userDao.deleteUser(id);
        return result;
	}

	public int updateUser(User user) {
		int result=userDao.updateUser(user);
        return result;
	}

	public User getUser(Integer id) {
		User user=userDao.getUser(id);
		return user;
	}

	public List<User> getUserList() {
		List<User> list=userDao.getUserList();
		return list;
	}

}
