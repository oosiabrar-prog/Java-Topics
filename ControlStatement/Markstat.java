package ControlStatement;

import javax.imageio.stream.ImageInputStream;

public class Markstat {

    public static void marks(int a) {

        if (a >= 35 && a <= 100) {
            System.out.println("Canditate Pass");
            if(a>=80 && a<=100) {
                System.out.println("Passed with S Grade");
            }else if (a>=60 && a<80) {
                System.out.println("Passed with A Grade");
            }else if (a>=40 && a<60) {
                System.out.println("Passed with B Grade");
            }else {
                System.out.println("Just Passed");
            }
        }
        else if(a>=0 && a<35) {
            System.out.println("Candidate Fail");
            if (a>30 && a<35) {
                System.out.println("Just Fail");
            }
        }else {
            System.out.println("Invalid Marks");
        }

    }
    public static void main (String[]args){

            marks(34);
            marks(50);
            marks(99);
            marks(120);
            marks(-50);
            marks(20);
        }
}
