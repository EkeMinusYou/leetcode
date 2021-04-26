/*
 * @lc app=leetcode id=1 lang=typescript
 *
 * [1] Two Sum
 */

// @lc code=start
function twoSum(nums: number[], target: number): number[] {
  let result: number[] = [];

  nums.forEach((num, idx) => {
    const residues = nums.slice(idx + 1);

    residues.forEach((rNum, rIdx) => {
      if (num + rNum === target) {
        result = [idx, idx + 1 + rIdx];
      }
    });
  });

  return result;
}
// @lc code=end

