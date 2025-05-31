import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    
    static int findMajorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Count the occurrences of each element
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int maxOccurrences = 0;
        int majorityElement = -1;
        
        // Find the element with maximum occurrences
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxOccurrences) {
                maxOccurrences = entry.getValue();
                majorityElement = entry.getKey();
            }
        }
        
        return majorityElement;
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 5, 4, 63, 3, 5}; // Example array
        int majorityElement = findMajorityElement(nums);
        
        if (majorityElement != -1) {
            System.out.println("The element with maximum occurrences is: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }
}