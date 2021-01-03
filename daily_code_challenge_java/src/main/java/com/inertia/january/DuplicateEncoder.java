// 01-01-21
package com.inertia.january;

import java.util.*;

public class DuplicateEncoder {
    //First Attempt
//    static String encode(String word) {
//        Map<String, Integer> map = new HashMap();
//
//        String string = "";
//        Arrays.stream(word.split("")).forEach(c -> {
//            if (Objects.isNull(map.get(c.toLowerCase()))) {
//                map.put(c.toLowerCase(), 1);
//            } else {
//                map.put(c.toLowerCase(), map.get(c.toLowerCase()) +1);
//            }
//        });
//        for (String character : word.split("")) {
//            if(map.get(character.toLowerCase()) == 1){
//                string = string + "(";
//            }
//            else{
//                string = string + ")";
//            }
//        }
//        return string;
//    }

    // Solution from Kata
//    static String encode(String word) {
//        word = word.toLowerCase();
//        String result = "";
//        for (int i = 0; i < word.length(); ++i) {
//            char c = word.charAt(i);
//            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
//        }
//        return result;
//    }
    // Second Attempt
    static String encode(String word) {
        word = word.toLowerCase();
        String result = "";
        for(Character c: word.toCharArray()){
            String newChar;
            newChar = word.lastIndexOf(c) == word.indexOf(c)? "(" : ")";
            result += newChar;
        };
        return result;
    }
}
