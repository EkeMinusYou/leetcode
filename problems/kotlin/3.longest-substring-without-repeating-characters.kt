/*
 * @lc app=leetcode id=3 lang=kotlin
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var tmp = ""
        var max = 0
        for (c in s.toCharArray()) {
            if (tmp.contains(c)) {
                tmp = tmp.takeLastWhile { it != c }
            }
            tmp += c
            if (tmp.length > max) max = tmp.length
        }
        return max
    }
}
// @lc code=end

