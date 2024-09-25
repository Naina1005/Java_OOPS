//Problem statement : Using constructors to initialize object

//Custom class
class class1{


    private int id;
    private String  name;


    //Getters for id and name
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }


    //Setters for id and name
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }


    //Constructor
    class1()
    {
       id = 12;
       name = "Your-name-here";

       setId(id);
       getId();
       setName(name);
       getName();
    }
}

//main class
public class Main{
    public static void main(String[] args) {
        class1 c1 = new class1();

        //if this line is commented than the values assigned in the constructor will be printed else these,
        //c1.setId(13);
        //c1.setName("Jack");

        int i = c1.getId();
        System.out.println(i);

        String n = c1.getName();
        System.out.println(n);
    }
}