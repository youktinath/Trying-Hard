/* Difficulty: EASY
 * Status: SOLVED
 * Given a sorted array of distinct integers and a target value, return the index
 *  if the target is found. If not, return the index where it would be if it were inserted in order.
 *  
 *  You must write an algorithm with O(log n) runtime complexity.
 */
package LeenCodeJava;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		return searchInsert(nums, target, 0, nums.length-1);
	}

	public int searchInsert(int[] nums, int target, int start, int end) {
		int mid = (start + end + 1) / 2;
		if (nums[0] > target) return 0;
		if(nums[nums.length-1] < target) return nums.length;
		if (nums[mid] > target) {
			if (nums[mid-1] < target) return mid;
			return searchInsert(nums, target, start, mid - 1);
		} else if (nums[mid] < target) {
			if (nums[mid+1] > target) return mid+1;
			return searchInsert(nums, target, mid + 1, end);
		} else
			return mid;
	}
}
