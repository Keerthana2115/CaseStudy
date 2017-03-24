package com.dao;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

import com.beans.Employee;



public class VectorEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method method=new Method();
		Vector<Employee> vectorObj=new Vector<Employee>();
		Scanner input=new Scanner(System.in);
		
		Employee emp1=new Employee(1129940,"keer");
		Employee emp2=new Employee(1129941,"abi");
		Employee emp3=new Employee(1129942,"kavs");
		
		vectorObj.add(emp1);
		vectorObj.add(emp2);
		vectorObj.add(emp3);
		
		System.out.print("\n Enter the emp id to search:");
		int empId=input.nextInt();
		method.vectorMethod(vectorObj,empId);
	}

}
