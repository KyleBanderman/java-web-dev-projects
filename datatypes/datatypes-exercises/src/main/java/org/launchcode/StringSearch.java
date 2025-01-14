package org.launchcode;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        String aliceInWonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner (System.in);
        System.out.println("What term would you like to search for in Alice in Wonderland?");
        String term = input.next();
        boolean check = aliceInWonderland.toLowerCase().contains(term.toLowerCase());
        System.out.println(check);

        int index = aliceInWonderland.indexOf(term);
        int length = term.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedAlice = aliceInWonderland.replace(term, "");
        System.out.println(modifiedAlice);
    }
}
