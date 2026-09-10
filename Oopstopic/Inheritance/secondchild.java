package Oopstopic.Inheritance;

public class secondchild extends father{

    public void property1(){

        System.out.println("I got land1 from father");
    }

    public static void main(String[] args) {

        secondchild sc = new secondchild();
        sc.land1();
        sc.property1();
        sc.maxmin();
    }
}
