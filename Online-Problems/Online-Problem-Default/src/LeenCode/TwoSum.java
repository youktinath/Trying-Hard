/* Difficulty: EASY
 * Status: SOLVED
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * 
 * You can return the answer in any order.
 */

package LeenCodeJava;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int numsLength = nums.length;
		int[] indices = new int[2];
		int[] numMinus = new int[numsLength];

		for (int i = 0; i < numsLength; i++) {
			numMinus[i] = target - nums[i];
		}
		for (int i = 0; i < numsLength; i++) {
			for (int j = 0; j < numsLength && i != j; j++) {
				if (nums[i] == numMinus[j]) {
					indices[0] = i;
					indices[1] = j;
				}
			}
		}
		return indices;
	}
}
