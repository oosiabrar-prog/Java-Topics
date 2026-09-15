package Polymorphism;

public class methodoverloading {

    public void car(){

        System.out.println("Toyota Innova");
    }

    public void car(int a){

        int x = a;
        System.out.println("We have total number of car is "+a);

    }

    public void car(String b){

        System.out.println("We are the best dealers of Toyota Cars");
    }

    public void car(double b, double c){

        double x = b;
        double y = c;
        System.out.println(b*c);
    }

    public static void main(String[] args) {

        methodoverloading ml = new methodoverloading();
        ml.car();
        ml.car(5);
        ml.car(" ");
        ml.car(10.5, 21.25);
    }
}
