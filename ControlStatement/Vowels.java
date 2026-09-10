package ControlStatement;

import java.util.Locale;

public class Vowels {

//    public static void vowel() {
//
//        String name = "We the people of india are brothers and sisters";
//
//        String letter = name.toUpperCase();
//        int count = 0;
//        int totcount = name.length();
//
//        for (int i = 0; i < name.length(); i++) {
//
//            char a = letter.charAt(i);
//
//            if (a == 'a' || a == 'e' || a == 'i' || a == 'o'
//                    || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
//                count++;
//
//            }
//        }
//        if (count > 0) {
//
//            System.out.println("---------------------------------------------------------------------------------------");
//            System.out.println(count + " - Vowels is Present in the Word - " + name);
//        } else {
//
//            System.out.println("---------------------------------------------------------------------------------------");
//            System.out.println("No Vowels Found");
//        }
//        System.out.println("---------------------------------------------------------------------------------------");
//        System.out.println("The total letters of the given String value is - "+totcount);
//
//    }

    public static void findword(){

        String name = "Java is a highly versatile programming language, and mastering Java allows " +
                "developers to build robust applications across various platforms. The unique \"Write Once, " +
                "Run Anywhere\" philosophy of Java ensures that Java bytecode runs smoothly on any compatible device. " +
                "Today, Java enterprise software and Java mobile applications continue to " +
                "power millions of digital services globally.";

        String n = "Java";

        int count = 0;

        for(int i = 0; i < name.length(); i++){

            System.out.println(i+"=="+name.compareTo(n));

            if(i == name.compareTo(n)){
                System.out.println("========> "+i+"=="+name.compareTo(n));
                count++;

            }
        }
        System.out.println("Total Words of "+n+ " is "+count);
    }

    public static void main(String[] args) {

        findword();
    }

}