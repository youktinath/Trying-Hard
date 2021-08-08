/* Difficulty: EASY
 * Status: SOLVED
 * Given a signed 32-bit integer x, return x with its digits reversed. 
 * If reversing x causes the value to go outside the signed 32-bit integer 
 * range [-2^31, 2^31 - 1], then return 0.
 */

package LeenCodeJava;

public class ReverseInteger {
	public int reverse(int x) {
		int reversed = 0;
		int prevReversed = 0;
		int z = Math.abs(x);
		while (z != 0) {
			int y = z % 10;
			reversed = reversed * 10 + y;
			if ((reversed - y)/10 != prevReversed) return 0;
			prevReversed = reversed;
			z = z/10;
		}
		reversed = x > 0 ? reversed : -reversed;
		return reversed;
	}

}
