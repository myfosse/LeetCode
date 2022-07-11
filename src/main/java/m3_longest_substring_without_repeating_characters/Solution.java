package m3_longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> usedLetters = new HashSet<>();
        int size = 0;

        int left = 0;
        int right = 0;

        char[] word = s.toCharArray();
        while (right < word.length) {
            if (!usedLetters.contains(word[right])) {
                usedLetters.add(word[right++]);
                size = Math.max(size, usedLetters.size());
            }
            else {
                usedLetters.remove(word[left++]);
            }
        }

        return size;
    }

    // Another faster solution
    /* public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;
        int size = 0;

        for (right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            if (map.containsKey(c)) {
                int prev = map.get(c);
                left = Math.max(left, prev + 1);
            }

            map.put(c, right);
            size = Math.max(size, right - left + 1);
        }

        return size;
    } */
}