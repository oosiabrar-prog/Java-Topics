package NewPack;

public class Mathstype {

    float a = 25;
    float b = 15;

    public void add(){

        float c = a+b;
        System.out.println("Addition of value (a+b) is "+c);
    }

    public void sub(){

        float c = a-b;
        System.out.println("Subraction of value (a-b) is "+c);
    }

    public void multi(){

        float c = a*b;
        System.out.println("Mulitplication of value (a*b) is "+c);
    }
    public void div(){

//        float a = 50;
//        float b = 20;
        float c = a/b;
        System.out.println("Division of value (a/b) is "+c);
    }

    public static void main(String[] args) {

        Mathstype m = new Mathstype();
        m.add();
        m.sub();
        m.multi();
        m.div();
    }
}
