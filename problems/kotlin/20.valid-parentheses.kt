/*
 * @lc app=leetcode id=20 lang=kotlin
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque(listOf<String>())
        s.toCharArray().forEach {
            when (it) {
                '(' -> stack.add("(")
                '[' -> stack.add("[")
                '{' -> stack.add("{")
                ')' -> if (stack.isEmpty() || stack.removeLast() != "(") return false
                ']' -> if (stack.isEmpty() || stack.removeLast() != "[") return false
                '}' -> if (stack.isEmpty() || stack.removeLast() != "{") return false
            }
        }
        return stack.isEmpty()
    }
}
// @lc code=end

