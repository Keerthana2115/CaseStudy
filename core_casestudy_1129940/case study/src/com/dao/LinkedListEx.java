package com.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import com.beans.Employee;

public class LinkedListEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method method=new Method();
		LinkedList<Employee> linkedList=new LinkedList<Employee>();
		Scanner input=new Scanner(System.in);
		
		Employee emp1=new Employee(1129940,"keer");
		Employee emp2=new Employee(1129941,"abi");
		Employee emp3=new Employee(1129942,"kavs");
		
		linkedList.add(emp1);
		linkedList.add(emp2);
		linkedList.add(emp3);
		
		System.out.print("\n Enter the emp id to search:");
		int empId=input.nextInt();
		method.linkedListMethod(linkedList,empId);
	}

}
