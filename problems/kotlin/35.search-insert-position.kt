/*
 * @lc app=leetcode id=35 lang=kotlin
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        val position = nums.binarySearch(target)
        if (position >= 0) return position
        return -position - 1
    }
}
// @lc code=end

