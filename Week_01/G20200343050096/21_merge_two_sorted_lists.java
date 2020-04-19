/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//1、双指针追加
//2、递归处理
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode head = l2.val > l1.val ? l1 : l2;
        if(l2.val > l1.val) {
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }
}
