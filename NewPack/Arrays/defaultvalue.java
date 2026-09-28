package NewPack.Arrays;

import java.util.Arrays;

public class defaultvalue {

    public static void main(String[] args) {

        String[] a = new String[5];
        int[] b = new int[5];
        byte[] c = new byte[5];
        short[] d = new short[5];
        long[] e = new long[5];
        char[] f = new char[5];
        boolean[] g = new boolean[5];
        float[] h = new float[5];
        double[] i = new double[5];

        a[0] = "Abrar";
        a[1] = "Farhath";
        a[2] = "Afham";
        a[3] = "Zahi";
        a[4] = "Alyaan";
        System.out.println(Arrays.toString(a));

        b[0] = 10;
        b[1] = 20;
        b[2] = 30;
        b[3] = 40;
        b[4] = 50;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(f));
        System.out.println(Arrays.toString(g));
        System.out.println(Arrays.toString(h));

        i[0] = 1;
        i[1] = 3;
        i[2] = 5;
        i[3] = 7;
        i[4] = 9;
        System.out.println(Arrays.toString(i));
    }
}
