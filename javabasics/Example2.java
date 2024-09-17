package javabasics;
import java.util.*;
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
public class Example2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array first

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;  // Skip duplicates for the current number
            }

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move pointers and skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // Move left pointer to get a larger sum
                } else {
                    right--;  // Move right pointer to get a smaller sum
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Example2 sol = new Example2();

        // Test case
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = sol.threeSum(nums);

        // Print results
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}