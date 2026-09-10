package ControlStatement;

import java.util.Arrays;

public class Jumpstate {

    public static void add(){

//        int a = 25;
//        int b = 35;
        String name = "Abrar is the student of Axess Technologies and he was enrolled in Testing AI Course with Placement " +
                "now he is attending the java session regularly from 2 months";

        String[] n = name.split(" ");

        for (int i =0; i < 1; i++){

            System.out.println(Arrays.toString(n));
        }
    }
    public static int ret(){

        int a = 10;
        int b = 20;
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
//        add();
        System.out.println(ret());
        System.out.println(2+4+6+" Abrar "+2+4+6);
    }

}
