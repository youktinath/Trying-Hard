/* Difficulty: EASY
 * Status: SOLVED
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 *  which has the largest sum and return its sum.
 *  
 *  A subarray is a contiguous part of an array.
 */
package LeenCodeJava;

import java.util.ArrayList;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		/*int len = nums.length;
		int flag = 0;
		int negValue = nums[0];
		int sum = 0;
		int sumTemp = 0;
		int max = 0;
		int start = 0;
		int index = 1;
		ArrayList<Integer> posIndex = new ArrayList<Integer>();
		for (int i = 0; i < len; i++) {
			if (nums[i] <= 0) {
				flag++;
				if (nums[i] >= negValue) negValue = nums[i];
			} else {
				posIndex.add(i);
			}
		}
		if (flag == len) return negValue;
		else {
			if (posIndex.size() == 1) return nums[posIndex.get(0)];
			start = posIndex.get(0);
			while (start < len && index < posIndex.size()) {
				sum += nums[start];
				sumTemp += nums[start];
				if (sumTemp <= 0) sumTemp = 0;
				if (sum > max && sum >= sumTemp) {
					max = sum;
				} else if (sumTemp > max && sum < sumTemp) {
					max = sumTemp;
				}
				System.out.println("max; " + max);
				System.out.println("sum; " + sum);
				System.out.println(sumTemp);
				if (start == posIndex.get(index) && start < len-1 && nums[start+1] <= 0) {
					sum = nums[start];
					index++;
				}
				start++;
			}
		}
		return max;*/
		int sum=0;
		int max= nums[0];
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			if(sum>max) max=sum;
			if(sum<0) sum=0;
		}
		return max;
	}
}
