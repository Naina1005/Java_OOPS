//problem statement : creating a custom class cylinder and using getters and setters to set its radius and height

//custom class
class Cylinder{
     private double r;
     private double h;


     //Setters
     public void setRadius()
     {
          this.r = r;
     }
     public void setHeight()
     {
          this.h = h;
     }


     //Getters
     public double getRadius(double r)
     {
          return r;
     }
     public double getHeight(double h)
     {
          return h;
     }

     //constructor
     Cylinder(){
          r = 10;
          h = 12;
          setRadius();
          setHeight();
          getRadius(r);
          getHeight(h);
     }

}

//main class
public class Main{
     public static void main(String[] args) {
          Cylinder cy = new Cylinder();
          cy.setRadius();
          double rad = cy.getRadius(9);
          System.out.println("Radius : "+rad);
          cy.setHeight();
          double he = cy.getHeight(8);
          System.out.println("Height : "+he);
     }
}