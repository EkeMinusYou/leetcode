/*
 * @lc app=leetcode id=1 lang=typescript
 *
 * [1] Two Sum
 */

// @lc code=start
function twoSum(nums: number[], target: number): number[] | void {
  const map: Map<number, number> = new Map();

  for (let i = 0; i < nums.length; i++) {
    const match = map.get(target - nums[i]);
    if (match != undefined) return [match, i];
    map.set(nums[i], i);
  }
}
// @lc code=end

