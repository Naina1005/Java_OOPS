//Problem statement : Creating a class animal and driving another class Dog from it

//Custom class Animal
class Animal{
    int legs;
    String color ;

    //getters
    public int getLegs(){
        return legs;
    }
    public String getColor(){
        return color;
    }

    //setters
    public void setLegs(int legs){
        this.legs = legs;
    }
    public void setColor(String color){
        this.color = color;
    }

    //constructor
    Animal(){
        setColor("white");
        setLegs(4);
        System.out.println("Number of Legs is : "+getLegs());
        System.out.println("Color of the Animal is : "+getColor());

    }
}

//custom class Dog inherited from animal
class Dog extends Animal{

    String sound;

    //getter
    public String getSound(){
        return sound;
    }

    //setter
    public void setSound(String sound){
        this.sound=sound;
    }

    //constructor
    Dog(){
        
        setSound("Bark");
        System.out.println("Sound of a dog : "+getSound());
    }
}


//main class
public class Main{
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d1 = new Dog();
    }
}


/* In the output :
the first two line are displayed after the execution of constructor of class Animal
and following four lines are displayed after the execution of constructor of class Dog
 */