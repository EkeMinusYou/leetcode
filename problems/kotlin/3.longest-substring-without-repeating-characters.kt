/*
 * @lc app=leetcode id=3 lang=kotlin
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var tmp = HashSet<Char>()
        var max = 0
        var i = 0
        var j = 0

        while (j < s.length) {
            if (tmp.contains(s[j])) {
                tmp.remove(s[i])
                i++
            } else {
                tmp.add(s[j])
                j++
                max = Math.max(max, j - i)
            }
        }
        return max
    }
}
// @lc code=end

