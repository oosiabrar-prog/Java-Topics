package ControlStatement;

public class Voting {

    public static void age(int b) {

        if (b >= 18 && b<=100) {

            System.out.println("Eligible for Voting");
        }
        else if (b < 0 || b > 100) {

            System.out.println("Invalid Age");

        }
        else {

            System.out.println("Not Eligible for Voting");
        }
    }
    public static void main(String[] args) {

        age(15);
        age(-1);
        age(20);
        age(150);

    }
}
