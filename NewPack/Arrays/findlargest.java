package NewPack.Arrays;

import java.util.Arrays;

public class findlargest {

    public static void largest() {

        int[] a = {12, 18, 22, 11, 8, 2, 13, 1, 12, 14, 35, 60};

        int max = a[0];
        int max2 = a[0];

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
        System.out.println("The largest number is "+a[a.length-1]);
        System.out.println("The second largest number is "+a[a.length-2]);

        for (int i=0; i<a.length; i++) {

            if (a[i] > max) {
                max = a[i];

            }
            for (int j = 0; j < a.length; j++) {

                if (a[j] < max) {
                    max2 = a[j];
                }
            }
        }
        System.out.println("The largest number is "+max);
        System.out.println("The second largest number is "+max2);
    }

    public static void main(String[] args) {

        largest();
    }
}
