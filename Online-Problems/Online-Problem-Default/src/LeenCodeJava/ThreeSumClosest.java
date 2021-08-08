/* Difficulty: MEDIUM
 * Status: SOLVED
 * Given an array nums of n integers and an integer target, find three integers 
 * in nums such that the sum is closest to target. Return the sum of the three integers. 
 * You may assume that each input would have exactly one solution.
 */
package LeenCodeJava;

import java.util.Arrays;

public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		int closestToTarget = nums[0] + nums[1] + nums[nums.length - 1];
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int firstIndex = i + 1;
			int lastIndex = nums.length - 1;
			while (lastIndex > firstIndex) {
				int temp = nums[firstIndex] + nums[i] + nums[lastIndex];
				if (temp > target) {
					lastIndex--;
				} else {
					firstIndex++;
				}
				if (Math.abs(temp - target) < Math.abs(closestToTarget - target)) {
					closestToTarget = temp;
				}
			}
		}
		
		return closestToTarget;
	}
}
