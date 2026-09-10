package ControlStatement;

import java.util.Scanner;

public class swit {

    public static void weekdays(){

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to check for Weekdays");
        System.out.println("Enter any one number from 1 to 7");

        int week = s.nextInt();

        System.out.println("Enter your Name");
        String a = s.next();
        System.out.println("Welcome " + a);


        switch(week){

            case 1:
                System.out.println("1 is for Monday");
                break;

            case 2:
                System.out.println("2 is for Tuesday");
                break;

            case 3:
                System.out.println("3 is for Wednesday");
                break;

            case 4:
                System.out.println("4 is for Thursday");
                break;

            case 5:
                System.out.println("5 is for Friday");
                break;

            case 6:
                System.out.println("6 is for Saturday");
                break;

            case 7:
                System.out.println("7 is for Sunday");
                break;

            default:
                System.out.println("Not Found");

        }
    }

    public static void main(String[] args) {
        weekdays();
    }
}
