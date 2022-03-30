#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#

# @lc code=start
from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hash: dict[int, int] = {}
        for index, num in enumerate(nums):
            if target - num in hash:
                return [index, hash[target - num]]
            hash[num] = index
        return []
# @lc code=end

