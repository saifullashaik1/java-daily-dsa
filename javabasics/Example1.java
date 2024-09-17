
public class Example1 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) { // Ensure nums1 is the smaller array
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;

        while (low <= high) {
            int partition1 = (low + high) / 2;
            int partition2 = (m + n + 1) / 2 - partition1;

            // Get the max on the left and min on the right for both arrays
            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];

            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];

            // Check if we found the right partition
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // If the total number of elements is odd
                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeft1, maxLeft2);
                } else { // If the total number of elements is even
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                }
            } else if (maxLeft1 > minRight2) {
                // Move towards the left in nums1
                high = partition1 - 1;
            } else {
                // Move towards the right in nums1
                low = partition1 + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    } }
