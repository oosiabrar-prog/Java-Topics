package NewPack.collections;

import java.util.ArrayList;
import java.util.List;

public class listtype {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();

        List<String> b = new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println(a);
        a.add(1,15);
        System.out.println(a);
        System.out.println(a.size());
        b.add("Java Class");
        b.add("Java");
        b.add("Class");
        System.out.println(b);
        System.out.println(b.size());
        b.add(1,"Axess");
        System.out.println(b);
        System.out.println(a.get(2));
        System.out.println(b.get(1));
        a.set(3,25);
        System.out.println(a);
        b.set(2,"Training");
        System.out.println(b);

    }
}
