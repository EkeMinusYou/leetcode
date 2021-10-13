/*
 * @lc app=leetcode id=2 lang=typescript
 *
 * [2] Add Two Numbers
 */

// @lc code=start
// class ListNode {
//     val: number
//     next: ListNode | null
//     constructor(val?: number, next?: ListNode | null) {
//       this.val = (val===undefined ? 0 : val);
//       this.next = (next===undefined ? null : next);
//     }
// }

function addTwoNumbers(l1: ListNode, l2: ListNode): ListNode {
  let sum = 0;
  let current = new ListNode(0);

  let p: ListNode | null = l1;
  let q: ListNode | null = l2;

  const result = current;

  while (p || q) {
    if(p) {
      sum += p.val;
      p = p.next;
    }
    if(q) {
      sum += q.val;
      q = q.next;
    }
    current.next = new ListNode(sum % 10);
    current = current.next;
    sum = sum > 9 ? 1 : 0;
  }
  if (sum > 0) current.next = new ListNode(sum);

  return result.next!;
}
// @lc code=end

