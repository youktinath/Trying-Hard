/* Difficulty: EASY
 * Status: SOLVED
 * need improvement
 * Given two binary strings a and b, return their sum as a binary string.
 */
package LeenCodeJava;

import java.util.ArrayList;
import java.util.List;

public class AddBinary {
	public String addBinary(String a, String b) {
		List<Integer> binaryDigits = new ArrayList<>();
		int carry = 0;
		String c = addZeros(a, b)[0];
		String d = addZeros(a, b)[1];
		String sum = "";
		int len = c.length();
		for (int i = len-1; i >= 0; i--) {
			int[] newBits = addThreeB(c.charAt(i), d.charAt(i), carry);
			binaryDigits.add(newBits[0]);
			carry = newBits[1];
		}
		if (carry == 1) {
			for (int i = len-1; i >= 0; i--) sum += binaryDigits.get(i);
			return "1" + sum;
		} else {
			for (int i = len-1; i >= 0; i--) sum += binaryDigits.get(i);
			return sum;
		}
	}
	public int[] addThreeB(char c1, char c2, int d) {
		int[] values = new int[2];
		if (c1 != c2 && d == 0) {
			values[0] = 1;
			values[1] = 0;
			return values;
		}
		else if (c1 != c2 && d == 1) {
			values[0] = 0;
			values[1] = 1;
			return values;
		}
		else if (c1 == '0' && c1 == c2 && d == 0) {
			values[0] = 0;
			values[1] = 0;
			return values;
		}
		else if (c1 == '0' && c1 == c2 && d == 1) {
			values[0] = 1;
			values[1] = 0;
			return values;
		}
		else if (c1 == '1' && c1 == c2 && d == 0) {
			values[0] = 0;
			values[1] = 1;
			return values;
		}
		else if (c1 == '1' && c1 == c2 && d == 1) {
			values[0] = 1;
			values[1] = 1;
			return values;
		} else return null;
	}
	public String[] addZeros(String a, String b) {
		String[] newStrings = new String[2];
		int nZeros = 0;
		String zeros = "";
		if (a.length() > b.length()) {
			nZeros = a.length() - b.length();
			for (int i = 0; i < nZeros; i++) zeros += "0";
			b = zeros + b;
			newStrings[0] = a;
			newStrings[1] = b;
			return newStrings;
		}
		else if (a.length() < b.length()) {
			nZeros = b.length() - a.length();
			for (int i = 0; i < nZeros; i++) zeros += "0";
			a = zeros + a;
			newStrings[0] = a;
			newStrings[1] = b;
			return newStrings;
		} else {
			newStrings[0] = a;
			newStrings[1] = b;
			return newStrings;
		}
	}
}
