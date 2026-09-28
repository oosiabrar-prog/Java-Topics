package NewPack.Nonprimitive;

public class stringmethod {

    public static void wordreverse(String name) {

//        String name = "Ajith Kumar";
        System.out.println(name);


        String[] words = name.split(" ");

        for (String s : words) {

            for (int j = s.length() - 1; j >= 0; j--) {
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {

        wordreverse("Axess Tech");
    }

}