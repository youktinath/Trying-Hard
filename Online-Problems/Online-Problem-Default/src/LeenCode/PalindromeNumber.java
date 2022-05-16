/* Difficulty: EASY
 * Status: UNSOLVED
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 *  For example, 121 is palindrome while 123 is not.
 */
package LeenCodeJava;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0) return false;
		int reversed = 0;
		int z = x;
		while (z != 0) {
			int y = z % 10;
			reversed = reversed * 10 + y;
			z = z/10;
		}
		return reversed == x;
	}
}
