package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(23);
        numbers.add(19);
        numbers.add(30);
        numbers.add(123);
        numbers.add(253);

        double avg = oddAvg(numbers);
        System.out.println("The average is: " + avg);
    }

    private static double oddAvg(List<Integer> list) {
        double sum = 0;
        int n = 0;
        for (int x : list) {
            if ((x % 2) != 0) {
                n = n + 1;
                sum = sum + x;
            }
        }
        return sum / n;
    }


}
