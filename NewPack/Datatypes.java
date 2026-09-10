package NewPack;

public class Datatypes extends Mathstype{

    byte a = 127;
    short b = 32767;
    int c = 2147483647;
    long d = 9223372000000000000l;
    float e = 3279.9992356f;
    double f = 541253.1254354535;
    char g = '@';
    boolean h = true;

    public void age(){

        int a = 43;
        System.out.println("My age is "+a+" years");
    }

    public void namelet(){

        char c = 'A';
        System.out.println("My names first Letter is "+c);
    }

    public void findstud(){

        boolean b = true;
        boolean bb = false;
        System.out.println("I am a Student: "+b);
        System.out.println("I am not a Student: "+bb);
    }

    public void prodprice(){

        double d = 25;
        System.out.println("This product price is "+d);
    }

    public void maxmin(){

        System.out.println("======================================================================================");
        System.out.println("The maximum and minimum value of byte is "+Byte.MAX_VALUE +" and "+Byte.MIN_VALUE);
        System.out.println("The maximum and minimum value of short is "+Short.MAX_VALUE +" and "+Short.MIN_VALUE);
        System.out.println("The maximum and minimum value of int is "+Integer.MAX_VALUE +" and "+Integer.MIN_VALUE);
        System.out.println("The maximum and minimum value of long is "+Long.MAX_VALUE +" and "+Long.MIN_VALUE);
        System.out.println("The maximum and minimum value of float is "+Float.MAX_VALUE +" and "+Float.MIN_VALUE);
        System.out.println("The maximum and minimum value of double is "+Double.MAX_VALUE +" and "+Double.MIN_VALUE);
        System.out.println("The maximum and minimum value of char is "+Character.MAX_VALUE +" and "+Character.MIN_VALUE);
    }

    public static void main(String[] args) {

        Datatypes dt = new Datatypes();
        System.out.println("The maximum value of byte is - "+dt.a);
        System.out.println("The maximum value of short is - "+dt.b);
        System.out.println("The maximum value of int is - "+dt.c);
        System.out.println("The maximum value of long is - "+dt.d);
        System.out.println("=================================================");
        System.out.println(dt.e);
        System.out.println(dt.f);
        System.out.println("==================================================");
        System.out.println(dt.g);
        System.out.println(dt.h);
        System.out.println("==================================================");
        dt.age();
        dt.findstud();
        dt.namelet();
        dt.prodprice();
        dt.maxmin();
        dt.add();
        dt.div();

    }
}
