package ControlStatement;

public class pattern {

    public static void alpha() {

        int al = 65;

        for (int i = 1; i <= 7; i++) {

            for (int j = 7; j >= i; j--) {

                System.out.print("  ");
            }

            for (int k = 0; k < i; k++) {

                System.out.print("  " + (char)al + " ");
                al++;
            }
            System.out.println();
            al = 65;
        }

    }

    public static void alpha1() {

        for (int i = 1; i <= 8; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" " + "*" + " ");
            }
            System.out.println();
        }

    }

    public static void starpattern() {

        int c = 97;

        for (int i = 1; i <= 8; i++) {

            for (int j = 1; j < i; j++) {

                System.out.print(" "+(char)c+" ");

                c++;
            }
            System.out.println();
        }

    }

    public static void startriangle() {

        for (int i = 1; i <= 7; i++) {

            for (int j = 7; j >= i; j--) {

                System.out.print("  ");
            }

            for (int k = 0; k < i; k++) {

                System.out.print("  " +"*"+ " ");
            }
            System.out.println();
        }

    }

    public static void pat1(){

        for(int i=7; i>=1; i--){

            for(int j=7; j>=i; j--){

                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){

                System.out.print(k+" ");
            }

            System.out.println();
        }

    }

    public static void pat2(){

        for(int i=1; i<=7; i++){

            for(int j=7; j>=i; j--){

                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){

                System.out.print("*"+" ");
            }

            System.out.println();
        }

    }

    public static void pat3(){

        int name = 65;

        for(int i=1; i<=7; i++){

            for(int j=7; j>=i; j--){

                System.out.print("  ");
            }
            for(int k = 0; k < i; k++){

                System.out.print((char)name+" ");
                name++;
            }
            System.out.println();
            name = 65;
        }

    }

    public static void pat4(){

        int name = 97;

        for(int i=7; i>=1; i--){

            for(int j=7; j>=i; j--){

                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){

                System.out.print((char)name+" ");
                name++;
            }
            System.out.println();
            name = 97;
        }

    }

    public static void pat5(){

        for(int a = 6; a >= 1; a--){

            for(int b = 6; b >= a; b--){

                System.out.print("  ");
            }
            for(int c = 1; c <= a; c++){

                System.out.print(c+" ");
            }
            System.out.println();
        }
        for(int d = 1; d <= 6; d++){

            for(int e = 6; e >= d; e--){
                System.out.print("  ");
            }
            for(int f = 1; f <= d; f++){

                System.out.print(f+" ");
            }
            System.out.println();
        }
    }

    public static void pat6(){

        for(int a = 6; a >= 1; a--){

            for(int b = 1; b <= a; b++){

                System.out.print("");
            }
            for(int c = 1; c <= a; c++){

                System.out.print(c+" ");
            }
            System.out.println();
        }
        for(int d = 1; d <= 6; d++){

            for(int e = 1; e <= d; e++){
                System.out.print("");
            }
            for(int f = 1; f <= d; f++){

                System.out.print(f+" ");
            }
            System.out.println();
        }
    }

    public static void pat7(){

        int name = 65;

        for(int a = 7; a >= 1; a--){

            for(int b = 7; b >= a; b--){

                System.out.print("  ");
            }
            for(int c = 0; c < a; c++){

                System.out.print((char)name+" ");
                name++;
            }
            System.out.println();
            name = 65;
        }
        for(int d = 1; d <= 7; d++){

            for(int e = 7; e >= d; e--){
                System.out.print("  ");
            }
            for(int f = 0; f < d; f++){

                System.out.print((char)name+" ");
                name++;
            }
            System.out.println();
            name = 65;
        }
    }

    public static void main(String[] args) {
       //alpha();
        //alpha1();
        //starpattern();
        //startriangle();
        //pat1();
        //pat2();
        //pat3();
        //pat4();
        //pat5();
        //pat6();
        pat7();
    }
}
