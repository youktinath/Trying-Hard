/* Difficulty: EASY
 * Status: UNSOLVED
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */
package LeenCodeJava;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		String s = strs[0];
		System.out.println("first s: " + s);
		if (strs.length == 1) {
			System.out.println("inside if with length...");
			System.out.println("len 1 s: " + s);
			return s;
		}
		String sNext = longestCommonPrefix(removeFirst(strs));
		while (!s.equals("")) {
			int sLen = s.length();
			System.out.println(s);
			if(s.equals(sNext)) {
				System.out.println("inside if...");
				System.out.println("final: " + s);
				return s;
			}
			else {
				System.out.println("inside else...");
				s =  s.substring(0, sLen - 1);
			}
		}
		return "A";
	}
	
	private static String[] removeFirst(String[] strs) {
		if (strs.length == 1) return null;
		String[] strsNew = new String[strs.length-1];
		for (int i = 1; i < strs.length; i++) {
			strsNew[i-1] = strs[i];
		}
		return strsNew;
	}
}
