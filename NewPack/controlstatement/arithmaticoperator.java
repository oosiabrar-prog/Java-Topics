package NewPack.controlstatement;

public class arithmaticoperator {

    int a = 8;
    int b = 12;

    public void arithmatic(){

        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(b%a);
        System.out.println(a++);
        System.out.println(b--);
        System.out.println(++a);
        System.out.println(--b);
        System.out.println("Now the value of a is "+a);
        System.out.println("Now the value of b is "+b);
    }

    public static void main(String[] args) {

        arithmaticoperator ac = new arithmaticoperator();
        ac.arithmatic();
    }
}
