/* Difficulty: EASY
 * Status: SOLVED
 * improvement required
 * Given a non-negative integer x, compute and return the square root of x.
 * 
 * Since the return type is an integer, the decimal digits are truncated, 
 * and only the integer part of the result is returned.
 */
package LeenCodeJava;

public class Sqrt {
	public int mySqrt(int x) {
		int k = 0;
		if (x == 1 || x == 2) return 1;
		for (int i = 1; i < x; i++) {
			if (i >= x/i) {
				k = i;
				break;
			}
		}
		//if (k * k == x) return k;
		//System.out.println(x-k*k);
		if (x-k*k < 0) return k-1;
		else return k;
	}
}
