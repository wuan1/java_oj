package Test;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
            return null;
    }
    public static void main(String[] args) {
      Solution solution = new Solution();
      int[] arr = {2,7,11,15};
      int target = 9;
      int[] result = solution.twoSum(arr,target);
      if(arr.length == 2 && result[0] == 1 &&result[1] == 2) {
          System.out.println("TestCase ok!");
      }else {
          System.out.println("TestCase Failed!");
      }
        int[] arr1 = {3,2,4};
        int target1 = 6;
        int[] result1 = solution.twoSum(arr1,target1);
        if(arr1.length == 2 && result[0] == 1 &&result[1] == 2) {
            System.out.println("TestCase ok!");
        }else {
            System.out.println("TestCase Failed!");
        }
    }
}

