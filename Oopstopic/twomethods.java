package Oopstopic;

import NewPack.Datatypes;

public class twomethods extends Datatypes {

    public void nonstate(){

        System.out.println("This is a non static Method");
        System.out.println("We need object to call this method in main method");
        System.out.println("----------------------------------------------------------------------------------");
    }

    public static void state(){

        System.out.println("This is a Static Method");
        System.out.println("We can call directly in main method without creating object for static method");
        System.out.println("-----------------------------------------------------------------------------------");
        twomethods td = new twomethods();
        td.car();
        System.out.println("Inside static method we need to create object to call a non static method");
        System.out.println("-------------------------------------------------------------------------------");
    }

    public void car(){

        System.out.println("Hyundai Creta");
        System.out.println("we can call another non static method inside this without using object");
        System.out.println("-------------------------------------------------------------------------------");
        nonstate();
    }

    public static void main(String[] args) {

        twomethods t = new twomethods();
        t.nonstate();
        state();
        t.age();
        t.findstud();
        System.out.println("We have extends datatypes class in to this class so its a single Inheritance");
        System.out.println("we have connected another class also called Mathstype to Datatypes " +
                "with out using Import option because its in a same package");
        System.out.println("To connect 2 class with different packages we need Import option");
        System.out.println("-------------------------------------------------------------------------------");
        t.sub();
        t.multi();
        System.out.println("Now we have connected 3 class eachother so its a Multilevel Inheritence");
    }
}
