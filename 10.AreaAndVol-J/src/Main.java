//Problem statement : calculating surface area and volume of cylinder using constructors

import java.util.Scanner;

//custom class
class Cylinder{
    private double r;
    private double h;
    private double sa;
    private double v;

    //Setters
    public void setR(double r){
        this.r = r;
    }
    public void setH(double h){
        this.h =h;
    }


    //Calculating surface area and volume
    public void setSa(double  sa){
        this.sa = sa;
    }
    public void setV(double v){
        this.v=v;
    }


    //Getters
    public double getR(){
        return r;
    }
    public double getH(){
        return h;
    }
    public double getSa(){
        return 2*3.14*r*(r+h);
    }
    public double getV(){
        return 3.14*r*r*h;
    }


    //constructor
    Cylinder(){

        //Taking input from user :
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        r = sc.nextDouble();
        System.out.println("Enter height : ");
        h = sc.nextDouble();

        //setting values
        setR(r);
        setH(h);
        setSa(sa);
        setV(v);

        //Printing values
        System.out.println("Radius : "+getR());
        System.out.println("Height : "+getH());
        System.out.println("Surface area : "+getSa());
        System.out.println("Volume : "+getV());
    }
}

//main class
public class Main {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();

    }
}