/*
 * @lc app=leetcode id=7 lang=typescript
 *
 * [7] Reverse Integer
 */

// @lc code=start
function reverse(x: number): number {
  const signFlag = x >= 0;
  const reversedAbsoluteNumber =  Number(String(Math.abs(x)).split('').reverse().join(''));

  const signedNumber = signFlag ? reversedAbsoluteNumber : reversedAbsoluteNumber * -1;

  if (signedNumber < 2 ** 31 * -1 || 2 ** 31 - 1 < signedNumber) return 0;

  return signedNumber;
}
// @lc code=end

