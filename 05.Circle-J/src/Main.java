//Problem statement : Creating a custom class circle with methods to initialize radius, calculate area and circumference

import java.util.*;

//custom class
class Circle{
    double getCircumference(float radius)
    {
        return 2*3.14*radius;
    }

    double getArea(float radius)
    {
        return 3.14*radius*radius;
    }
}

//main class
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r;
        System.out.println("Enter the radius of the circle : ");
        r = sc.nextFloat();

        //Creating an object of custom class circle
        Circle c1 = new Circle();

        //Printing the circumference
        double circum;
        circum = c1.getCircumference(r);
        System.out.println("Circumference of the Circle is : "+circum+" uts");

        //Printing the area
        double ar;
        ar = c1.getArea(r);
        System.out.println("Area of the Circle is : "+ar+" uts");

    }
}