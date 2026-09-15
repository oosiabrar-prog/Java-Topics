package Polymorphism;

public class override extends Method_overriding{

    @Override
    public void mobile() {
        super.mobile();
        System.out.println("These all mobile brands we available");
    }

    @Override
    public void mobile(int a) {
        super.mobile(a);
        System.out.println("We dont have old models");
    }

    public static void main(String[] args) {

        override o = new override();
        o.mobile();
        o.mobile(100);
    }
}
