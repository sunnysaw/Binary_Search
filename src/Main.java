public class Main {
    class Solution {
        public int search(int[] nums, int target) {
            int left = nums[0], right = nums.length - 1, middle = 0;
            int result = -1;
            middle = (left + right) / 2;
            while(left <= right){
                middle = left + (right - left) / 2;
                if(nums[middle] == target){
                    result = middle;
                    break;
                }
                else if (middle < target){
                    left = middle + 1;
                }
                else
                {
                    middle = middle - 1;
                }
                middle = (left + right) / 2;
                left++;
                right--;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}