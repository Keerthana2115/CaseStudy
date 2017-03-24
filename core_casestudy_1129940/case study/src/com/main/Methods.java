package com.main;
import java.util.Scanner;

import com.beans.*;
public class Methods {

	 Beans objBeans=new Beans();
	 Scanner get = new Scanner(System.in);
	 FindArea area = new FindArea();
	void calculateMethod(String inputArea)
	{
		 if(inputArea.equalsIgnoreCase("triangle"))
	        { 
	        System.out.print("\n Enter base of triangle: ");
	      
	      
	        objBeans.setBase(get.nextDouble()); 
	        System.out.print("\n Enter  height of triangle: ");
	        objBeans.setHeight(get.nextDouble()) ; 
	        double triangleArea=area.findTriangle( objBeans.getBase(),  objBeans.getHeight());
	        System.out.println("\n Area of Triangle: "+triangleArea);
	        }
	        
	        else if(inputArea.equalsIgnoreCase("rectangle"))
	        {
	        System.out.print("\n Enter length of rectangle: ");
	         objBeans.setLength(get.nextDouble()); 
	         System.out.print("\n Enter breadth of rectangle: ");
	        objBeans.setBreadth(get.nextDouble()); 
	        double rectangleArea=area.findRectangle( objBeans.getLength(),  objBeans.getBreadth());
	        System.out.println("\n Area of Rectangle: "+rectangleArea);
	        }
	        
	        else if(inputArea.equalsIgnoreCase("square"))
	        {
	        System.out.print("\n Enter side of square: ");
	         objBeans.setSide(get.nextDouble()); 
	        double squareArea=area.findSquare( objBeans.getSide());
	        System.out.println("\n Area of Square: "+squareArea);
	        }
	        
	        else if(inputArea.equalsIgnoreCase("circle"))
	        {
	        System.out.print("\n Enter radius of circle: ");
	        objBeans.setRadius(get.nextDouble()); 
	        double circleArea=area.findCircle( objBeans.getRadius());
	        System.out.println("\n Area of Circle: "+circleArea);
	        }
	        
	        else if(inputArea.equalsIgnoreCase("parallelogram"))
	        {
	        	System.out.print("\n Enter length of parallelogram: ");
	            objBeans.setLength(get.nextDouble()); 
	            System.out.print("\n Enter height of parallelogram: ");
	            objBeans.setHeight(get.nextDouble()); 
	            double parallelogramArea=area.findParallelogram( objBeans.getLength(),objBeans.getHeight());
	            System.out.println("\n Area of parallelogram: "+parallelogramArea);
	        }
	        else if(inputArea.equalsIgnoreCase("rhombus"))
	        {
	        	System.out.print("\n Enter side of rhombus: ");
	            objBeans.setSide(get.nextDouble()); 
	            System.out.print("\n Enter height of rhombus: ");
	            objBeans.setHeight(get.nextDouble()); 
	            double rhombusArea=area.findRhombus( objBeans.getSide(),objBeans.getHeight());
	            System.out.println("\n Area of rhombus: "+rhombusArea);
	        }
	        else if(inputArea.equalsIgnoreCase("trapezium"))
	        {
	        	System.out.print("\n Enter one base of trapezium : ");
	            objBeans.setBase(get.nextDouble()); 
	            System.out.print("\n Enter second base of trapezium: ");
	            objBeans.setBase2(get.nextDouble()); 
	            System.out.print("\n Enter height of trapezium: ");
	            objBeans.setHeight(get.nextDouble()); 
	            double trapeziumArea=area.findTrapezium( objBeans.getBase(),objBeans.getBase2(),objBeans.getHeight());
	            System.out.println("\n Area of trapezium: "+trapeziumArea);
	        }
	        else if(inputArea.equalsIgnoreCase("ellipse"))
	        {
	        	System.out.print("\n Enter major axes of ellipse: ");
	            objBeans.setMajorAxes(get.nextDouble()); 
	            System.out.print("\n Enter minor axes of ellipse: ");
	            objBeans.setMinorAxes(get.nextDouble()); 
	           
	            double ellipseArea=area.findEllipse( objBeans.getMajorAxes(),objBeans.getMinorAxes());
	            System.out.println("\n Area of ellipse: "+ellipseArea);
	        }
	        else if(inputArea.replaceAll("\\s+","").equalsIgnoreCase("equilateral triangle".replaceAll("\\s+","")))
	        { 
	        System.out.print("\n Enter side of equilateral triangle: ");
	      
	      
	        objBeans.setSide(get.nextDouble()); 
	        
	        double equiTriangleArea=area.findEquiTriangle( objBeans.getSide());
	        System.out.println("\n Area of 	Equilateral Triangle: "+equiTriangleArea);
	        }
	       
	        else
	        {
	        	System.out.println("Enter valid shapes");
	        }
	      
	}
}
