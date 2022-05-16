/* Difficulty: MEDIUM
 * Status: UNSOLVED
 * Given an integer array nums that may contain duplicates, 
 * return all possible subsets (the power set).
 * 
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 */
package LeenCodeJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SubsetsII {
	List<List<Integer>> subsWithDup = new ArrayList<List<Integer>>();
	/*public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<Integer> numsArray = new ArrayList<Integer>();
		for (int element : nums) numsArray.add(element);
		List<List<Integer>> tempList = new ArrayList<List<Integer>>(subsets(numsArray));
//		for (List<Integer> list : tempList) {
//			Collections.sort(list);
//		}
		Set<List<Integer>> uniqueList = new LinkedHashSet<List<Integer>>(tempList);
		List<List<Integer>> finalList = new ArrayList<List<Integer>>(uniqueList);
		System.out.println(tempList.size());
		System.out.println(finalList.size());
		System.out.println(tempList);
		return finalList;
	}
	
	private static List<List<Integer>> subsets(List<Integer> numsArray) {
		Collections.sort(numsArray);
		List<List<Integer>> listWithDup = new ArrayList<List<Integer>>();
		List<Integer> emptyArray = new ArrayList<Integer>();
		if (!listWithDup.contains(emptyArray)) {
			listWithDup.add(emptyArray);
		}
		int len = numsArray.size();
		if (len == 0) {
			listWithDup.add(numsArray);
		}
		else if (len == 1) {
			if (!listWithDup.contains(numsArray)) listWithDup.add(numsArray);
		}
		else {
			listWithDup.add(numsArray);
			List<Integer> temp1 = new ArrayList<Integer>();
			temp1.addAll(numsArray.subList(1, len));
			if (!listWithDup.contains(temp1)) {
				listWithDup.add(temp1);
				Set<List<Integer>> tempSubList = new LinkedHashSet<List<Integer>>(subsets(temp1));
				List<List<Integer>> subList = new ArrayList<List<Integer>>(tempSubList);
				listWithDup.addAll(subList);
			}
			
			List<Integer> temp2 = new ArrayList<Integer>();
			temp2.addAll(numsArray.subList(0, len-1));
			if (!listWithDup.contains(temp2)) {
				listWithDup.add(temp2);
				Set<List<Integer>> tempSubList = new LinkedHashSet<List<Integer>>(subsets(temp2));
				List<List<Integer>> subList = new ArrayList<List<Integer>>(tempSubList);
				listWithDup.addAll(subList);
			}
			
			for (int i = 0; i < len-1; i++) {
				List<Integer> temp3 = new ArrayList<Integer>();
				temp3.addAll(numsArray.subList(0, i));
				temp3.addAll(numsArray.subList(i+1, len));
				if (!listWithDup.contains(temp3)) {
					listWithDup.add(temp3);
					Set<List<Integer>> tempSubList = new LinkedHashSet<List<Integer>>(subsets(temp3));
					List<List<Integer>> subList = new ArrayList<List<Integer>>(tempSubList);
					listWithDup.addAll(subList);
				}
			}
		}
		return listWithDup;
	}*/
	
	
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<Integer> numsArray = new ArrayList<Integer>();
		for (int element : nums) numsArray.add(element);
		Collections.sort(numsArray);
		if (nums.length == 0) subsWithDup.add(numsArray);
		else {
			
		}
		return subsWithDup;	
	}
	
}
