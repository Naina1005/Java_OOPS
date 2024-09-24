//Problem statement : Creating a custom class Employee with properties - (salary, name) and methods -(getsalary, getname, setname)

//custom class
class Employee{
   int salary;
   String name;
   int getSalary()
   {
       return salary;
   }
   String getName()
   {
       return name;
   }
   void setName(String name)
   {
       this.name = name;
       System.out.println(name);

   }
}


//main class
public class Main{
    public static void main(String[] args) {

        //Creating object of custom class Employee
        Employee jack = new Employee();
        jack.salary =12345;
        jack.name = "Jack Wilson";
        int sal = jack.getSalary();
        System.out.println(sal);
        String name = jack.getName();
        System.out.println(name);
        jack.setName("John Hayes");
    }
}