/*
 * Given an array of strings patterns and a string word, return the number of strings 
 * in patterns that exist as a substring in word.
 * 
 * A substring is a contiguous sequence of characters within a string.
 */
package LeenCodeJava;

public class NStringSubstring {
	public int nStringSubstring (String[] patterns, String word) {
		int sum = 0;
		for (String s : patterns) {
			if (isSubstring(word, s)) sum ++;
		}
		return sum;
	}
	public boolean isSubstring(String s, String word) {
		if (s.length() < word.length()) return false;
		else {
			int i = 0;
			while (i < s.length()) {
				if (s.charAt(i) == word.charAt(0) && s.substring(i).length() >= word.length()) {
					if (s.substring(i, i+word.length()).equals(word)) return true;
					else i++;
				} else i++;
			}
		}
		return false;
	}
}
