//Problem statement : Overloading a constructor Employee to initialize salary = 1000;

//custom class
class Employee{
    int sal;

    //constructor-default
    Employee()
    {
        System.out.println("Default constructor with no arguments.");
    }

    //overloaded constructor
    Employee(int sal)
    {
        System.out.println("\nOverloaded constructor with int sal as argument.");
        System.out.print(sal);
    }
}

//main class
public class Main {
    public static void main(String[] args) {
        int salary;
        Employee e1 = new Employee();
        Employee e2 = new Employee(1000);
    }
}
