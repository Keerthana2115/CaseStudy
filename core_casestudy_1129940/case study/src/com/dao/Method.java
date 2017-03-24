package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Vector;

import com.beans.Employee;

public class Method {
	
	
	void hashMap(HashMap<Integer,String> getMap,int empId)
	{
		 Set<Entry<Integer, String>> keyValueSet = getMap.entrySet();
         
	        for (Entry<Integer, String> entry : keyValueSet) 
	        {
	        	if(entry.getKey()==empId)
	        	{
	            System.out.println("Employee name:"+entry.getValue());
	            System.out.println("Employee id   :"+entry.getKey());
	        	}
	        }
	}
	void arrayListMethod(ArrayList<Employee> getArrayList,int empId)
	{
		
		
		for(Employee loop: getArrayList)
		{
			if(loop.getEmpId()==empId)
			{
				System.out.println("Employee name:"+loop.getEmpName());
	            System.out.println("Employee id   :"+loop.getEmpId());
			}
		}
		

	}
	void linkedListMethod(LinkedList<Employee> getLinkedList,int empId)
	{
		
		
		for(Employee loop: getLinkedList)
		{
			if(loop.getEmpId()==empId)
			{
				System.out.println("Employee name:"+loop.getEmpName());
	            System.out.println("Employee id   :"+loop.getEmpId());
			}
		}
		

	}
	void vectorMethod(Vector<Employee> getVector,int empId)
	{
		
		
		for(Employee loop: getVector)
		{
			if(loop.getEmpId()==empId)
			{
				System.out.println("Employee name:"+loop.getEmpName());
	            System.out.println("Employee id   :"+loop.getEmpId());
			}
		}
		

	}
}
