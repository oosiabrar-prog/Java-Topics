package ControlStatement;

public class Looping {

    public static void loop1(){

        int a = 5;
        int b = 1;
        int c = 5;

        for(int i = 0; i < a; i++){

            for(int j = 0; j < b; j++){
                System.out.print(" * ");
            }
            System.out.println();
            b++;
        }

        for(int i = 0; i < a; i++){

            for(int j = 0; j < c; j++){
                System.out.print(" # ");
            }
            System.out.println();
            c--;
        }
    }

    public static void loop2(){

        int a = 6;
        int b = 1;
        int c = 6;

        for(int i = 0; i < a-1; i++){

            for(int j = 1; j <= c; j++){
                System.out.print(" @ ");
            }
            System.out.println();
            c--;
        }
        for(int i = 0; i < a; i++){

            for(int j = 0; j < b; j++){
                System.out.print(" $ ");
            }
            System.out.println();
            b++;
        }
    }

    public static void loop3(){

        int a = 6;
        int b = 1;
        int c = 6;

        for(int i = 0; i < a-1; i++){

            for(int j = 1; j <= c; j++){
                System.out.print(" "+j);
            }
            System.out.println();
            c--;
        }
        for(int i = 0; i < a; i++){

            for(int j = 0; j < b; j++){
                System.out.print(" "+j);
            }
            System.out.println();
            b++;
        }
    }

    public static void loop4(){

        int d = 65;

        for(int i = 0; i < 5; i++){

            for(int j = i; j < 6; j++){
                System.out.print((char)d+" ");
                d++;
            }
            System.out.println();
            d = 65;
        }
        for(int i = 0; i < 6; i++){

            for(int j = 0; j <= i; j++){
                System.out.print((char)d+" ");
                d++;
            }
            System.out.println();
            d = 65;
        }
    }

    public static void loop5(){

        int d = 65;
        int a = 6;

        for(int i = 0; i < a-1; i++){

            for(int k = 0; k < i; k++){
                System.out.print("  ");

            }
            for(int j = i; j < a; j++){
                System.out.print((char)d+" ");
                d++;
            }
            System.out.println();
            d = 65;
        }
        for(int i = 0; i < a; i++){

            for(int k = a-1; k > i; k--){
                System.out.print("  ");

            }
            for(int j = 0; j <= i; j++){
                System.out.print((char)d+" ");
                d++;
            }
            System.out.println();
            d = 65;
        }
    }

    public static void loop6(){

        int d = 65;
        int a = 6;

        for(int i = 0; i < a-1; i++){

            for(int k = 0; k < i; k++){
                System.out.print(" ");

            }
            for(int j = i; j < a; j++){
                System.out.print((char)d+" ");
                d++;
            }
            System.out.println();
            d = 65;
        }
        for(int i = 0; i < a; i++){

            for(int k = a-1; k > i; k--){
                System.out.print(" ");

            }
            for(int j = 0; j <= i; j++){
                System.out.print((char)d+" ");
                d++;
            }
            System.out.println();
            d = 65;
        }
    }

    public static void loop7(){

        int d = 65;
        int a = 6;

        for(int i = 0; i < a; i++){

            for(int k = a-1; k > i; k--){
                System.out.print(" ");

            }
            for(int j = 0; j <= i; j++){
                System.out.print((char)d+" ");
                d++;
            }
            System.out.println();
            d = 65;
        }
        for(int i = 1; i < a; i++){

            for(int k = 0; k < i; k++){
                System.out.print(" ");

            }
            for(int j = i; j < a; j++){
                System.out.print((char)d+" ");
                d++;
            }
            System.out.println();
            d = 65;
        }

    }

    public static void main(String[] args) {

        loop1();
        loop2();
        loop3();
        loop4();
        loop5();
        loop6();
        loop7();

    }
}
