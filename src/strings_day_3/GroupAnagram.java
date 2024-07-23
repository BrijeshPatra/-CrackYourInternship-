package strings_day_3;

import java.util.*;
public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Initialize a HashMap to store the grouped anagrams
        HashMap<String,List<String>>map=new HashMap<>();

        // Process each string in the input array
        for(String str: strs){
            // Convert the string to a char array, sort it, and convert it back to a string
            char[]chArray=str.toCharArray();
            Arrays.sort(chArray);
            String sortedString=new String(chArray);

            // Check if the sorted string is already a key in the HashMap
            if (!map.containsKey(sortedString)) {
                // If not, create a new list for this sorted string
                map.put(sortedString, new ArrayList<String>());
            }

            // Add the original string to the list of anagrams
            map.get(sortedString).add(str);
        }
        // Collect the results: the values of the HashMap
        return new ArrayList<>(map.values());

    }
    public static void main(String[] args) {

    }
}
