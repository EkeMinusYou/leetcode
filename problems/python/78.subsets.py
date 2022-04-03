#
# @lc app=leetcode id=78 lang=python3
#
# [78] Subsets
#

# @lc code=start
from typing import List


class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        output: List[List[int]] = []
        n = len(nums)

        def backtrack(first=0, cur: List[int] = []):
            if len(cur) == k:
                output.append(cur.copy())
                return
            for i in range(first, n):
                cur.append(nums[i])
                backtrack(i + 1, cur)
                cur.pop()

        for k in range(n + 1):
            backtrack()
        return output


# @lc code=end
