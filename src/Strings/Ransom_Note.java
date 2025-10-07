package Strings;

import java.util.HashMap;

public class Ransom_Note {
    public static void main(String[] args) {
        Ransom_Note rn = new Ransom_Note();
        String ransomNote = "aa";
        String magazine = "ab";
        boolean result = rn.canConstruct(ransomNote,magazine);
        System.out.println(result);
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magHash = new HashMap<>();

        for(char c : magazine.toCharArray()){
            magHash.put(c , magHash.getOrDefault(c , 0)+1);
        }

        for(char c : ransomNote.toCharArray()){
            if(!magHash.containsKey(c)||magHash.get(c)<=0){
                return false;
            }
            magHash.put(c , magHash.get(c)-1);
        }
        return true;
    }
}
