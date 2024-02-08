/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curNode = head;
        while (curNode.next != null) {
            ListNode newNode = new ListNode(gcd(curNode.val, curNode.next.val), curNode.next);
            curNode.next = newNode;
            curNode = curNode.next.next;
        }
        return head;
    }

    private int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}