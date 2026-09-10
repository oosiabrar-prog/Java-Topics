package Abstractiontopic;

public class Warrior extends Gamecharacter{


    @Override
    public void attack() {
        System.out.println("Attack the Warrior");
    }

    @Override
    public void defend() {
        System.out.println("Defend the Warrior");
    }

    public static void main(String[] args) {
        Gamecharacter g = new Warrior();
        Gamecharacter gc = new Mage();
        g.attack();
        g.defend();
        gc.attack();
        gc.defend();
    }
}
