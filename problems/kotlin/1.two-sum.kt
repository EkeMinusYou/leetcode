/*
 * @lc app=leetcode id=1 lang=kotlin
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for ((index, num) in nums.withIndex()) {
            val match = map.get(target - num)
            if (match != null) {
                return intArrayOf(match, index)
            }
            map.set(num, index)
        }

        return intArrayOf()
    }
}
// @lc code=end

