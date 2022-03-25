/*
 * @lc app=leetcode id=703 lang=kotlin
 *
 * [703] Kth Largest Element in a Stream
 */

// @lc code=start
import java.util.*

class KthLargest(val k: Int, nums: IntArray) {
    private val heap = PriorityQueue<Int>(k)

    init {
        heap.addAll(nums.toList())
        while (heap.size > k) {
            heap.poll()
        }
    }

    fun add(`val`: Int): Int {
        heap.add(`val`)
        if (heap.size > k) {
            heap.poll()
        }
        return heap.peek()
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * var obj = KthLargest(k, nums)
 * var param_1 = obj.add(`val`)
 */
// @lc code=end

