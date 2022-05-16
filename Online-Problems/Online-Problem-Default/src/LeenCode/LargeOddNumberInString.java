/* Difficulty: EASY
 * Status: SOLVED
 * You are given a string num, representing a large integer. 
 * Return the largest-valued odd integer (as a string) that is a non-empty substring of num, 
 * or an empty string "" if no odd integer exists.
 * 
 * A substring is a contiguous sequence of characters within a string.
*/
package LeenCodeJava;

public class LargeOddNumberInString {
	/*public String largestOddNumber(String num) {
		int numLength = num.length() - 1;
		for (int i = numLength; i >= 0; i--) {
			char value = num.charAt(i);
			if((int) value % 2 == 0) {
				num = num.substring(0, i);
			} else break;
			//System.out.println(num);
		}
		
		return num;
	}*/
	
	public String largestOddNumber(String num) {
		int numLength = num.length() - 1;
		while (numLength >= 0) {
			char value = num.charAt(numLength);
			if((int) value % 2 == 1)
				return num.substring(0, numLength + 1);
			numLength--;
		}
		return "";
	}

}
