package LeenCodeJava;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		/*LargeOddNumberInString lonis = new LargeOddNumberInString();
		String s = "243";
		System.out.println(lonis.largestOddNumber(s));*/
		
		/*TwoSum ts = new TwoSum();
		int[] nums = {2, 3, 5, 4};
		int target = 8;
		for(int element : ts.twoSum(nums, target)) {System.out.println(element);};*/
		
		/*ThreeSumClosest ts = new ThreeSumClosest();
		int[] nums = {-1,2,1000,-400};
		int target = 100;
		System.out.println(ts.threeSumClosest(nums, target));*/
		
		/*ReverseInteger ri = new ReverseInteger();
		int x = 123;
		System.out.println(ri.reverse(x));*/
		
		/*PalindromeNumber pn = new PalindromeNumber();
		int x = -121;
		System.out.println(pn.isPalindrome(x));*/
		
		/*RomanToInteger ri = new RomanToInteger();
		String s = "CIV";
		System.out.println(ri.romanToInt(s));*/
		
		/*LongestCommonPrefix los = new LongestCommonPrefix();
		String[] strs = {"doogg", "dof", "df"};
		System.out.println(los.longestCommonPrefix(strs));*/
		
		/*ValidParentheses vp = new ValidParentheses();
		String s = "([}}])";
		System.out.println(vp.isValid(s));*/
		
		/*MergeTwoSortedLists mtsl = new MergeTwoSortedLists();
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		l2.next.next.next = new ListNode(5);
		ListNode l = mtsl.mergeTwoLists(l1, l2);
		while (l != null) {
			System.out.println(l.val);
			l = l.next;
		}*/
		
		/*RemoveDuplicatesfromSortedArray rdsa = new RemoveDuplicatesfromSortedArray();
		int[] nums = {1, 1, 2, 2, 3, 4, 4, 4, 5};
		System.out.println(rdsa.removeDuplicates(nums));*/
		
		/*SubsetsII s2 = new SubsetsII();
		int[] nums = {1,2};
		//List<Integer> numsArray = new ArrayList<Integer>();
		//for (int element : nums) numsArray.add(element);
		System.out.println(s2.subsetsWithDup(nums));*/
		
		/*RemoveElement re = new RemoveElement();
		int[] nums = {3,2,2,3};
		int val = 2;
		System.out.println(re.removeElement(nums, val));*/
		
		/*MoveZeroes mz = new MoveZeroes();
		int[] nums = {0,1,4,0,3,0,1,0,-1,0};
		mz.moveZeroes(nums);*/
		
		ImplementstrStr iss = new ImplementstrStr();
		String haystack = "mississippi";
		String needle = "issip";
		System.out.println(iss.strStr(haystack, needle));
	}

}
