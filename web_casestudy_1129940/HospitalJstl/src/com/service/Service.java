package com.service;

import java.util.ArrayList;

import com.beans.Hospital_Beans;
import com.dao.Methods;

public class Service {

	Methods objDao=new Methods();
	
	
	public int serviceHome(String username,String password) throws Exception
	{
		int count=objDao.daoHome(username,password);
		return count;
	}
	
	public ArrayList<Hospital_Beans> serviceSuccess(String username) throws Exception
	{
		return objDao.daoSuccess(username);
	}
	
	public int  serviceCreate( String name, int age,
			String gender, String marital_status, long phone_number,
			String disease_type,String username,String password) throws Exception
	{
		return objDao.daoCreate(   name,  age,gender,  marital_status,  phone_number, disease_type,username,password);
	
	}
}
