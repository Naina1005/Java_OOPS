//Problem statement : creating a class Rectangle with methods to initialize sides, calculate area and perimeter

import java.util.*;

//Custom class
class Rectangle{
    int Perimeter(int len , int wid)
    {
        return 2*(len + wid);
    }

    int area(int len, int wid)
    {
        return len*wid;
    }
}
//Main class
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l , b;

        //Taking input from user
        System.out.println("Enter the length: ");
        l = sc.nextInt();
        System.out.println("Enter the width: ");
        b = sc.nextInt();

        //Creating an object of custom class rectangle
        Rectangle pqrs = new Rectangle();

        //printing perimeter
        int p;
        p = pqrs.Perimeter(l,b);
        System.out.println("Perimeter of the rectangle is : "+p);

        //Printing area
        int ar;
        ar = pqrs.area(l,b);
        System.out.println("area of the rectangle is "+ar);
    }
}