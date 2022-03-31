#
# @lc app=leetcode id=703 lang=python3
#
# [703] Kth Largest Element in a Stream
#

# @lc code=start
import heapq
from typing import List

class KthLargest:
    priority_queue: List[int]
    max_size: int

    def __init__(self, k: int, nums: List[int]):
        heapq.heapify(nums)
        self.priority_queue = nums
        self.max_size = k
        while len(self.priority_queue) > self.max_size:
            heapq.heappop(self.priority_queue)

    def add(self, val: int) -> int:
        heapq.heappush(self.priority_queue, val)
        if len(self.priority_queue) > self.max_size:
            heapq.heappop(self.priority_queue)
        return self.priority_queue[0]


# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)
# @lc code=end

