/*
 * @lc app=leetcode id=153 lang=kotlin
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    fun findMin(nums: IntArray): Int {
        if (nums.size == 1) return nums.first()
        if (nums.first() < nums.last()) return nums.first()

        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            var mid = left + (right - left) / 2

            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1]
            }

            if (nums[mid - 1] > nums[mid]) {
                return nums[mid]
            }

            if (nums[0] < nums[mid]) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return -1
    }
}
// @lc code=end

