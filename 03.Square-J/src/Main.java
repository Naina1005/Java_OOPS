//Problem statement : Creating a class square with various methods to initialize side, calculate area

import java.util.*;

//custom class
class Square{
    int getPerimeter(int side)
    {
        return 4*side;
    }
    int getArea(int side)
    {
        return side*side;
    }
}

//main class
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the side of the square : ");
        n = sc.nextInt();

        //Creating object
        Square abcd = new Square();

        //Printing perimeter
        int p;
        p = abcd.getPerimeter(n);
        System.out.println("Perimeter of the square is : "+p);

        //Printing area
        int ar;
        ar = abcd.getArea(n);
        System.out.println("area of the square is : "+ar);
    }
}