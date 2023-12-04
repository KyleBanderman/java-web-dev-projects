package org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;
public class SumEven {
    public static Integer sum(ArrayList<Integer> arr) {
        int total = 0;
        for (int i : arr) {
            if (i%2 == 0) {
                total += i;
            }
        }
        return total;
    }

    public static ArrayList<String> print(ArrayList<String> arr) {
        ArrayList<String> returnList = new ArrayList<>();
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a word length:");
        int numChars = input.nextInt();
        for (String i : arr) {
            if (i.length() == numChars) {
                returnList.add(i);
            }
        }
        return returnList;
    }
}
