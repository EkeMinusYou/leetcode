/*
 * @lc app=leetcode id=300 lang=kotlin
 *
 * [300] Longest Increasing Subsequence
 */

// @lc code=start
class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        val dp = mutableListOf<Int>(nums[0])

        for ((index, num) in nums.withIndex()) {
            if (dp.size <= index + 1 && dp.last() < num) {
                dp.add(num)
                continue
            }
            val upperBoundIndex = -dp.binarySearch(num) - 1
            if (upperBoundIndex < 0) continue
            dp[upperBoundIndex] = num
        }

        return dp.size
    }
}
// @lc code=end

