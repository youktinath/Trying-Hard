package LeenCodeJava;

public class TestMain {

	public static void main(String[] args) {
		/*LargeOddNumberInString lonis = new LargeOddNumberInString();
		String s = "243";
		System.out.println(lonis.largestOddNumber(s));*/
		
		TwoSum ts = new TwoSum();
		int[] nums = {2, 3, 5, 4};
		int target = 8;
		for(int element : ts.twoSum(nums, target)) {System.out.println(element);};

	}

}
