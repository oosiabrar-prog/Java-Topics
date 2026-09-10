package ControlStatement;

import javax.swing.*;

public class alldecision {

    public static void Details(String name) {



        if (name=="Abrar" || name=="Revanth" || name=="Gomathi" || name=="Chandru") {
            System.out.println("Details as follows");
            if (name=="Abrar") {
                System.out.println("His name is Abrar");
                System.out.println("He is from Central Chennai");
                System.out.println("He is a Student");
            }else if(name=="Revanth"){
                System.out.println("His name is Mr.Revanth");
                System.out.println("He is from Velachary");
                System.out.println("He is a Trainer");
            }else if(name=="Gomathi"){
                System.out.println("Her name is Gomathi");
                System.out.println("She is from Taramani");
                System.out.println("She is a Student");
            }else if(name=="Chandru"){
                System.out.println("His name is Chandru");
                System.out.println("He is from Adyar");
                System.out.println("He is a Student");
            }

        }
        else{
            System.out.println("Details not found");
        }
    }

    public static void main(String[] args) {

        Details("Chandru");
    }

}
