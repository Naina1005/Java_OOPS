//Problem statement : Creating a custom class cellphone with various methods to print "ringing", "vibrating" etc

//Custom class
class Cellphone{
    void ring()
    {
        System.out.println("  Ringing");
    }
    void call()
    {
        System.out.println("Incoming call");
    }
    void vibrate()
    {
        System.out.println("vibrating");
    }
    void music()
    {
        System.out.println("  Playing Music");
    }
}

//Main class
public class Main{
    public static void main(String[] args) {
        Cellphone phone = new Cellphone();
        System.out.print("Calling friend:");
        phone.ring();
        phone.call();
        phone.vibrate();
        System.out.print("\nOpening music player:");
        phone.music();
    }
}