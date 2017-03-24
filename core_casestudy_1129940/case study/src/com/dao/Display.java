package com.dao;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Display {
	public static void main(String[] args) 
    {
        Method method=new Method(); 
        Scanner input=new Scanner(System.in);
         
        HashMap<Integer, String> map = new HashMap<Integer, String>();
         
        
         
        map.put(1129940, "keer");
         
        map.put(1129941, "abi");
         
        map.put(1129942, "divi");
         
        map.put(1129943, "jo");
         
        map.put(1129944, "kavs");
         
        System.out.print("\n Enter emp id:");
        int empId=input.nextInt();
        
        method.hashMap(map,empId);
        
         
       
    }    
}
