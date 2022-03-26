/*
 * @lc app=leetcode id=200 lang=kotlin
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    private lateinit var grid: Array<CharArray>
    private var islandCount = 0

    fun numIslands(grid: Array<CharArray>): Int {
        this.grid = grid

        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == '1') {
                    islandCount++
                    println("count++")
                    check(i, j)
                }
            }
        }

        return islandCount
    }

    fun check(i: Int, j: Int) {
        if (grid[i][j] == '1') {
            grid[i][j] = '2'
            if (grid.size > i - 1 && i - 1 >= 0)  check(i - 1, j)
            if (grid.size > i + 1) check(i + 1, j)
            if (grid[i].size > j - 1 && j - 1 >= 0) check(i, j - 1)
            if (grid[i].size > j + 1) check(i, j + 1)
        }
    }
}
// @lc code=end

