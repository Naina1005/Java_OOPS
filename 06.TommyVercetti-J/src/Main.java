/* Problem statement : creating  a custom class Tommy Vercetti for Rockstar games
   capable of hitting, running, firing, swimming etc  */

//custom class
class TommyVercetti{
    void hit()
    {
        System.out.println("Hitting...");
    }

    void run()
    {
        System.out.println("Running...");
    }

    void fire()
    {
        System.out.println("Firing...");
    }

    void swim()
    {
        System.out.println("Swimming...");
    }
}

//main class
public class Main{
    public static void main(String[] args) {

        TommyVercetti tommy = new TommyVercetti();
        tommy.hit();
        tommy.fire();
        tommy.run();
        tommy.swim();
    }
}