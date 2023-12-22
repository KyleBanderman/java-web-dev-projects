import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //getting the string and converting it into an ArrayList with only alphabet letters
        String string = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charsInArray = string.toLowerCase().toCharArray();
        ArrayList<Character> charsInArrayList = new ArrayList<>();
        for (char item : charsInArray) {
            charsInArrayList.add(item);
        }
        charsInArrayList.removeIf(Character::isWhitespace);
        charsInArrayList.removeIf(item -> item == '.');

        //creating output holder
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        HashMap<Character, Integer> output = new HashMap<>();
        for (char item : alphabet) {
            output.put(item, 0);
        }

        //counting letters for output
        for (char item : charsInArrayList) {
            for(Map.Entry<Character, Integer> data : output.entrySet()) {
                if (data.getKey() == item) {
                    int number = data.getValue();
                    number++;
                    output.put(item, number);
                }
            }
        }
        System.out.println(output);
    }
}