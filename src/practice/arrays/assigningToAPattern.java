package practice.arrays;

public class assigningToAPattern {
    public static void main(String[] args) {
        int sumCounter = 0;
        int[] lengthOf40 = new int[100];

        // Will run the loop 100 times to add together the results of the values for each
        // loop.
        for (int i = 0; i < 100; i++) {
            sumCounter = sumCounter + i;
            System.out.println(sumCounter);

        }
    }
}
