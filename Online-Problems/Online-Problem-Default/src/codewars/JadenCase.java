/* Difficulty: UNKNOWN
 * Status: SOLVED
 * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) 
 * and After Earth (2013). Jaden is also known for some of his philosophy that he delivers 
 * via Twitter. When writing on Twitter, he is known for almost always capitalizing every word. 
 * For simplicity, you'll have to capitalize each word, check out how contractions are expected 
 * to be in the example below.
 * 
 * Your task is to convert strings to how they would be written by Jaden Smith. 
 * The strings are actual quotes from Jaden Smith, but they are not capitalized 
 * in the same way he originally typed them.
 */
package codewars;

public class JadenCase {
	public String toJadenCase(String phrase) {
		if (phrase == null) return null;
		String[] pharseSplited = phrase.split(" ");
		StringBuilder st = new StringBuilder();
		if (phrase.equals("")) return null;
		else {
			for (String s : pharseSplited) {
				st.append(upperCase(s)).append(" ");
			}
			return st.toString().substring(0, phrase.length());
		}
		
	}
	
	public String upperCase(String s) {
		String[] sBreaked = s.split("");
		if (s.length() == 1) return s.toUpperCase();
		else {
			StringBuilder upper = new StringBuilder();
			upper.append(sBreaked[0].toUpperCase());
			for (int i = 1; i < sBreaked.length; i++) upper.append(sBreaked[i]);
			return upper.toString();
		}
	}
}
