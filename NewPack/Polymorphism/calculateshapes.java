package NewPack.Polymorphism;

public class calculateshapes {

    public void shapes(){

        System.out.println("Welcome to Calculate the area of Shapes");
    }

    public void shapes(int a){

        int x = a;
        System.out.println("The area of circle is "+x);
    }

    public void shapes(float b){

        float y = b;
        System.out.println("The area of rectangle is "+y);

    }

    public void shapes(double c){

        double z = c;
        System.out.println("The area of triangle is "+z);

    }

    public static void main(String[] args) {
        calculateshapes cs = new calculateshapes();
        cs.shapes();
        cs.shapes(10);
        cs.shapes(20.012);
        cs.shapes(25.555555);
    }
}
