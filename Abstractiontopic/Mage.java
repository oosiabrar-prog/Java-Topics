package Abstractiontopic;

public class Mage extends Gamecharacter{
    @Override
    public void attack() {
        System.out.println("Attack the Mage");
    }

    @Override
    public void defend() {
        System.out.println("Defend the Mage");
    }

    public static void main(String[] args) {

        Gamecharacter gc = new Mage();
        Gamecharacter g = new Warrior();
        gc.attack();
        gc.defend();
        g.defend();
        g.attack();
    }
}
