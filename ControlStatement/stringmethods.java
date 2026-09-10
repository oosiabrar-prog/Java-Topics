package ControlStatement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class stringmethods {

    public static void whileloop(){

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println("========>"+i);
            i++;
        }
        while (i<15);
        {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {

        whileloop();

//        String m = "Good day India";
//        String n = "  Good day  ";
//        String p = " ";
//        int a = 5;
//
//        System.out.println(m+n);
//        System.out.println(m.length());
//        System.out.println(m.charAt(1));
//        System.out.println(m.toLowerCase());
//        System.out.println(m.toUpperCase());
//        System.out.println(m.concat(n));
//        System.out.println(n.trim());
//        System.out.println(m.replace('G','F'));
//        System.out.println(m.replace("Good","Great"));
//        System.out.println(m.indexOf("day"));
//        System.out.println(p.isEmpty());
//        System.out.println(p.isBlank());
//        System.out.println(m.substring(2,7));
//        System.out.println(n.repeat(3));
//        String[] w = m.split(" ");
//        System.out.println(Arrays.toString(w));

    }
}
