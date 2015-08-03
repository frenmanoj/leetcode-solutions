package algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Valid Anagram Total
 *  
 * Given two strings s and t, write a function to determine if t is an anagram of s.

 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * 
 * @author frenmanoj
 *
 */
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {

		if (s == null || t == null) {
			return false;
		}

		if (s.length() != t.length()) {
			return false;
		}

		// building a hash map with the character counts
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : s.toCharArray()) {

			int count = map.get(c) == null ? 0 : map.get(c);

			map.put(c, count + 1);
		}

		for (char c : t.toCharArray()) {

			if (map.get(c) == null) {
				return false;
			}

			int count = map.get(c);

			if (count <= 0) {
				return false;
			}

			map.put(c, count - 1);
		}

		return true;
	}

	public static void main(String[] args) {

		ValidAnagram checker = new ValidAnagram();
		System.out.println(checker.isAnagram("abcd", "adbc"));
	}
}
