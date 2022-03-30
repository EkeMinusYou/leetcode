#
# @lc app=leetcode id=3 lang=python3
#
# [3] Longest Substring Without Repeating Characters
#

# @lc code=start
from typing import Set

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen: Set[str] = set()
        max_count, i, j = 0, 0, 0

        while j < len(s):
            if s[j] in seen:
                seen.remove(s[i])
                i+=1
            else:
                seen.add(s[j])
                j+=1
                max_count = max(max_count, j - i)

        return max_count
# @lc code=end

