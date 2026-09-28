package NewPack.Arrays;

public class duplicatevalue {

    public static void samevalue() {

        int[] numbers = {1, 2, 3, 7, 3, 8, 7, 1, 2};

        System.out.println("Duplicate values in the array are: ");

        // Outer loop selects a number to check
        for (int i = 0; i < numbers.length; i++) {

            // Inner loop compares it with all the numbers that come AFTER it
            for (int j = i + 1; j < numbers.length; j++) {

                //System.out.println(numbers[i]+" - "+numbers[j]);
                // If a match is found, it's a duplicate!
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }

    public static void main(String[] args) {

        samevalue();
    }
}
