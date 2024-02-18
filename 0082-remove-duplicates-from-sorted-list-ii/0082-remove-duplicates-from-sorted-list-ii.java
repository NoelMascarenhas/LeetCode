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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(prev.next!=null && prev.next.next!=null){
            if(prev.next.val != prev.next.next.val){
                prev=prev.next;
            }else{
                int duplicate = prev.next.val;
                while(prev.next!=null && prev.next.val==duplicate){
                    prev.next=prev.next.next;
                }
            }
        }
        return dummy.next;
    }
}