import java.util.Arrays;

public class MaxProductSubArray {
 
        public static int maxProduct(int[] nums) {
            if (nums == null || nums.length == 0) {
                throw new IllegalArgumentException("Input array is empty or null");
            }
    
            int maxProduct = nums[0];
            int minProduct = nums[0];
            int result = maxProduct;
    
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < 0) {
                    int temp = maxProduct;
                    maxProduct = minProduct;
                    minProduct = temp;
                }
                maxProduct = Math.max(nums[i], maxProduct * nums[i]);
                minProduct = Math.min(nums[i], minProduct * nums[i]);
    
                result = Math.max(result, maxProduct);
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            int[] nums = {2, 3, -2, 4};
            Arrays.sort(nums);
            System.out.println("Maximum product subarray value is: " + maxProduct(nums));
        }
    }

    

