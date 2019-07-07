package com.example.anagram;

import java.util.ArrayList;
import java.util.List;

 class Anagramer  {


    private final List<Integer> digitsMap = new ArrayList<>();

    public String anagramIt(CharSequence s) {
        final String[] stringArrays = s.toString().split(" ");
        final StringBuilder sb = new StringBuilder();
        for (String stringArray : stringArrays) {
            StringBuilder sb1 = new StringBuilder();
            for (int j = 0; j < stringArray.length(); j++) {
                if (!Character.isLetter(stringArray.charAt(j))) {
                    digitsMap.add(j);
                    continue;
                }
                sb1.append(stringArray.charAt(j));
            }
            sb1 = sb1.reverse();
            for (int position : digitsMap) {
                sb1.insert(position, stringArray.charAt(position));
            }
            sb.append(sb1);
            sb.append(" ");
            digitsMap.clear();
        }
        return sb.toString();
    }
}
