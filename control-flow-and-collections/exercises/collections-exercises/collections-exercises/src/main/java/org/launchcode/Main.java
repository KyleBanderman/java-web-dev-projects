package org.launchcode;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int i : integerArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String story = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] storyWords = story.split(" ");
        System.out.println(Arrays.toString(storyWords));

        String[] sentence = story.split("\\.");
        System.out.println(Arrays.toString(sentence));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(9);
        numbers.add(8);
        numbers.add(7);
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(0);
        System.out.println(SumEven.sum(numbers));
    }
}
