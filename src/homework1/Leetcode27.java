package homework1;

public class Leetcode27 {

	public static void main(String[] args) {
		int[] testCase1 = {3,2,2,3};
		int[] testCase2 = {0,1,2,2,3,0,4,2};
		
		int testResult1 = removeElement(testCase1, 3);
		int testResult2 = removeElement(testCase2, 2);
		
		System.out.println("Test Case 1: " + testResult1);
		System.out.println("Test Case 2: " + testResult2);
	}

	public static int removeElement(int[] nums, int val) {
		int count = 0;
		
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] != val) {
        		nums[count++] = nums[i];
        	}
        }
        
        return count;
    }
}
