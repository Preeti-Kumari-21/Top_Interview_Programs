package com.scaler.top_interview_programs.DSA;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        Character ans = findFirstNonRepeatingCharacter(s);
        System.out.println(ans);
    }

    private static Character findFirstNonRepeatingCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return null;
    }
}