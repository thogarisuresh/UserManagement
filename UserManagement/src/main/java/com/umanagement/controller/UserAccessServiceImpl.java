package com.umanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umanagement.entity.UserRegistration;

@Service
public class UserAccessServiceImpl implements UserAccessService{

	@Autowired 
	private UserAccessDaoImpl accessDaoImpl;
	public String registerUser(UserRegistration user) {
		return  (String) accessDaoImpl.save(user);
	}

}
