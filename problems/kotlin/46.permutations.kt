/*
 * @lc app=leetcode id=46 lang=kotlin
 *
 * [46] Permutations
 */

// @lc code=start
import java.util.Collections

class Solution {
    private val output: MutableList<List<Int>> = mutableListOf()

    fun backtrack(n: Int, nums: MutableList<Int>, first: Int) {
        if (first == n) {
            output.add(nums.toList())
        }
        for (i in first..n - 1) {
            Collections.swap(nums, first, i)
            backtrack(n, nums, first + 1)
            Collections.swap(nums, i, first)
        }
    }

    fun permute(nums: IntArray): List<List<Int>> {
        backtrack(nums.size, nums.toMutableList(), 0)
        return output;
    }
}
// @lc code=end

