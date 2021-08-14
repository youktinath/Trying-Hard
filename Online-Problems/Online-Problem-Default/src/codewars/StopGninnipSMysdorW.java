/* Difficulty: UNKNOWN
 * Status: SOLVED
 * source: https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
 * Write a function that takes in a string of one or more words, and returns 
 * the same string, but with all five or more letter words reversed (like the name of this kata).
 * 
 * Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 */
package codewars;

public class StopGninnipSMysdorW {
	public String spinWords(String sentence) {
		String[] splitedSentence = sentence.split(" ");
		String revSentence = "";
		for (String s : splitedSentence) {
			if (s.length() >= 5) {
				revSentence += revesered(s) + " ";
			} else
				revSentence += s + " ";
		}
		return revSentence.substring(0, sentence.length());
	}
	
	public String revesered(String s) {
		int len = s.length();
		String reversedS = "";
		for (int i = 0; i < len; i++) {
			reversedS += s.charAt(len - i - 1);
		}
		return reversedS;
	}

}
