//Problem statement : Using getters and setters to set radius of a circle
class Circle{
    private double rad;

    public double getPerimeter()
    {
        return 2*3.14*rad;
    }

    public double getArea()
    {
        return 3.14*rad*rad;
    }

    public double getRad()
    {
        return rad;
    }

    //Setting radius using setter
    public void setRad(double radius)
    {
        rad = radius;
    }
}

public class Main{
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.setRad(11);

        double r = c1.getRad();
        System.out.println("The radius is : "+r);

        double p = c1.getPerimeter();
        System.out.println("The Perimeter is "+p);

        double ar = c1.getArea();
        System.out.println("The area is : "+ar);
    }
}