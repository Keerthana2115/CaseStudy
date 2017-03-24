package com.main;

class OverloadShapes
{
    void area(float x)
    {
        System.out.println("the area of the square is "+x*x+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14286 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
public class Shapes {
	 public static void main(String args[]) 
		{
		   OverloadShapes object = new OverloadShapes();
		   object.area(5);
		   object.area(11,12);
		   object.area(2.5);
	        }
	
}
