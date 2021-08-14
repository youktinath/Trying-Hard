/* Difficulty: EASY
 * Status: SLOVED
 * Given a string s consisting of some words separated by some number of spaces, 
 * return the length of the last word in the string.
 * 
 * A word is a maximal substring consisting of non-space characters only.
 */
package LeenCodeJava;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		int len = s.length();
		int end = len-1;
		int start = 0;
		while (end >= 0) {
			if (s.lastIndexOf(' ') == end) {
				s = s.substring(0, end);
				end--;
			} else break;
		}
		start = end;
		while (end >= 0 && start >= 0) {
			if (s.charAt(start) != ' ') {
				start--;
			} else return end-start;
		}
		return end-start;
	}
}
