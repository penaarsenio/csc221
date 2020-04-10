package project_3;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.*;

public class HistogramAlphaBet {

    public static TreeMap<Character,Double> getMap() throws IOException{
        //initialize variable for the total number characters
        Double sumOfAll=0.0 ;
        //creates a hashmap of each letter in the alphabet(the keys) and stores the frequency of that letter (values)
        //all the letters are converted to lower case letters. Special characters are not included.
        HashMap<Character, Double> characters = new HashMap<Character, Double>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("C:\\Users\\Arsi\\Desktop\\alice.txt"));
            while (scanner.hasNext()) {
                char[] line = scanner.nextLine().toLowerCase().toCharArray();
                for (Character character : line) {
                    if (Character.isLetter(character)){
                        if (characters.containsKey(character)) {
                            characters.put(character, characters.get(character) + 1.0);
                        } else {
                            characters.put(character, 1.0);
                        }
                    }
                }
            }
        } finally {
            if (scanner != null){
                scanner.close();
            }
        }
        //Calculates the sum all of the frequencies
        for (Map.Entry<Character, Double> entry : characters.entrySet()) {
            sumOfAll += entry.getValue();
        }
        //replaces all the values of the keys with their probabilities by dividing their values by the sum of all.
        for (Map.Entry<Character, Double> entry : characters.entrySet()) {
            characters.replace(entry.getKey(), (entry.getValue() / sumOfAll));
        }
        //Use a comparator to sort the probabilities in decreasing order and store it in a new map.
        Comparator<Character> comparator = new ValueComparator<Character, Double>(characters);
        TreeMap<Character, Double> Map = new TreeMap<Character, Double>(comparator);
        Map.putAll(characters);
        //returns the new map with decreasing probabilities of each character.
        return Map;
    }
}


