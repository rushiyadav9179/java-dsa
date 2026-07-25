package BinarySearch;

// Problem Name: First Bad Version
// Topic: Binary Search, First Occurrence
// Time Complexity: O(log n)
// Space Complexity: O(1)

/*
 * The VersionControl class and isBadVersion() API
 * are provided by LeetCode.
 *
 * boolean isBadVersion(int version);
 */

public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {

        int low = 1;
        int high = n;
        int ans = n;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(isBadVersion(mid)) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
    }
}