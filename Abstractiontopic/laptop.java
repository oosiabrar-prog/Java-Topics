package Abstractiontopic;

public class laptop extends Device{
    @Override
    public void turnOn() {
        System.out.println("Turn on the Laptop");
    }

    public static void main(String[] args) {

        smartphone sp = new smartphone();
        laptop l = new laptop();

        sp.turnOn();
        l.turnOn();
    }
}
