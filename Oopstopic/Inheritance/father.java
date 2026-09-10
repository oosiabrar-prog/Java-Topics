package Oopstopic.Inheritance;

import NewPack.Datatypes;

public class father extends Datatypes {

    public static void land(){

        System.out.println("This land is for first child");
    }

    public static void land1(){

        System.out.println("This land is for second child");
    }

    public static void main(String[] args) {
        land();
        land1();
    }
}
