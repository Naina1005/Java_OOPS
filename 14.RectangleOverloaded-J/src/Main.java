//Problem statement : Overloading a class named as rectangle for initializing parameters

import java.util.Scanner;

//custom class
class Rectangle{
    int l,b;

    //constructors
    Rectangle(){
        l =10;
        b = 8;
        System.out.println("Default constructor1 with length as 10 and breadth as 8");
    }
    Rectangle(int l){
        b = 8;
        System.out.println("Overloaded constructor2 with breadth initialized as 8");
    }
    Rectangle(int l, int b)
    {
        System.out.println("Overloaded Constructor3 ");
    }
}

//main class
public class Main{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); //default constructor will be called
        Rectangle r2 = new Rectangle(1); //default constructor will be called
        Rectangle r3 = new Rectangle(2,4); //default constructor will be called

    }
}