package NewPack.Polymorphism;

public class animaloverride extends Animals{

    @Override
    public void sounds() {
        super.sounds();
        System.out.println("---------------------");
    }

    @Override
    public void cow() {
        super.cow();
        System.out.println("Boo Boo");
    }

    @Override
    public void cat() {
        super.cat();
        System.out.println("Meow Meow");
    }

    @Override
    public void dog() {
        super.dog();
        System.out.println("woof woof");
    }

    public static void main(String[] args) {

        animaloverride a = new animaloverride();
        a.sounds();
        a.cow();
        a.cat();
        a.dog();
    }
}
