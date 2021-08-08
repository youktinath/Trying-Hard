/* Difficulty: EASY
 * Status: SOLVED
 * TODO : slow
 * Implement strStr().
 * 
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
package LeenCodeJava;

public class ImplementstrStr {
	public int strStr(String haystack, String needle) {
		int count = 0;
		int start = 0;
		int lenH = haystack.length();
		int lenN = needle.length();
		if (needle.equals("")) return 0;
		while (start < lenH) {
			if (haystack.charAt(start) != needle.charAt(0)) {
				start++;
			} else if (haystack.charAt(start) == needle.charAt(0) && lenN > 1) {
				for (int i = 1; i < lenN; i++) {
					if (start+i >= lenH) return -1;
					if (haystack.charAt(start+i) == needle.charAt(i)) {
						count++;
					}
				}
				if (count == lenN-1) return start;
				else {
					start++;
					if (start >= lenH) return -1;
				}
				count = 0;
			} else if (haystack.charAt(start) == needle.charAt(0) && lenN == 1) {
				return start;
			}
		}
		return -1;
	}
}
