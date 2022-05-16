/* Difficulty: EASY
 * Status: SOLVED
 * Given an integer array nums and an integer val, remove all occurrences of val 
 * in nums in-place. The relative order of the elements may be changed.
 * 
 * Since it is impossible to change the length of the array in some languages, 
 * you must instead have the result be placed in the first part of the array nums. 
 * More formally, if there are k elements after removing the duplicates, then the 
 * first k elements of nums should hold the final result. It does not matter 
 * what you leave beyond the first k elements.
 * 
 * Return k after placing the final result in the first k slots of nums.
 */
package LeenCodeJava;

import java.util.Arrays;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		Arrays.sort(nums);
		int k = 0;
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (nums[i] == val) {
				nums[i] = nums[len-k-1];
				k++;
			}
		}
		return len-k;
	}
}
