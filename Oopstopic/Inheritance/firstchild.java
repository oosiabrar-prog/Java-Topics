package Oopstopic.Inheritance;

public class firstchild extends father{

    public void property(){

        System.out.println("I got land from father");
    }

    public static void main(String[] args) {

        firstchild fc = new firstchild();
        fc.land();
        fc.property();
        fc.findstud();
    }
}
