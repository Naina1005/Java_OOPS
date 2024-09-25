//Problem statement : using constructor sto print Surface area and volume of spheres

import java.util.*;

//Custom class
class Sphere{
    private double r,sa,v;

    //getters
    public double getR(){
        return r;
    }
    public double getSa(){
        return 3*3.14*r*r;
    }
    public double getV(){
        return (4*3.14*r*r*r)/3;
    }

    //setters
    public void setR(double r)
    {
        this.r = r;
    }
    public void setSa(double sa)
    {
        this.sa = sa;
    }
    public void setV(double v)
    {
        this.v = v;
    }


    //Constructor
    Sphere(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter radius : ");
        r = sc.nextDouble();

        setR(r);
        setSa(sa);
        setV(v);

        System.out.println("Radius : "+getR());
        System.out.println("Surface area : "+getSa());
        System.out.println("Volume : "+getV());
    }
}

//Main class
public class Main{
    public static void main(String[] args) {
        Sphere sp = new Sphere();
    }
}