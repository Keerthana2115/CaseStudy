package com.main;

import com.beans.Beans;
import java.util.Scanner;

abstract class CalculateArea {
    abstract double findTriangle(double base, double height);
    abstract double findRectangle(double length, double breadth);
    abstract double findSquare(double side);
    abstract double findCircle(double radius);
    abstract double findParallelogram(double breadth,double height);
    abstract double findRhombus(double side,double height);
    abstract double findEllipse(double side,double height);
    abstract double findEquiTriangle(double side);
}
 
class FindArea extends CalculateArea {
 
    double findTriangle(double base, double height)
    {
        double area = (base*height)/2;
        return area;
       
    }
 
    double findRectangle(double length, double breadth)
    {
        double area = length*breadth;
        return area;
        
    }
     
    double findSquare(double side)
    {
        double area = side*side;
        return area;
       
    }
     
    double findCircle(double radius)
    {
        double area = 3.14286*radius*radius;
        return area;
       
    }
    double findParallelogram(double breadth,double height)
    {
    	double area=breadth*height;
    	return area;
    }
    double findRhombus(double side,double height)
    {
    	double area=side*height;
    	return area;
    }
    double findTrapezium(double base1,double base2,double height)
    {
    	double area=(0.5*(base1+base2))*height;
    	return area;
    }
    double findEllipse(double majorAxes,double minorAxes)
    {
    	double area=3.14286*majorAxes*minorAxes;
    	return area;
    }
    double findEquiTriangle(double side)
    {
    	double area=0.433012*(side*side);
    	return area;
    }
    
}
 public class Area {
    public static void main(String args[]) throws Exception
    {
        double length, base,breadth, height, radius, side;
       
        Methods method=new Methods();
      
        
         Scanner get = new Scanner(System.in);
         
        System.out.print("Enter the shape to calculate area:");
        String inputArea=get.next();
        method.calculateMethod(inputArea);
        
         
        
    }
 }
