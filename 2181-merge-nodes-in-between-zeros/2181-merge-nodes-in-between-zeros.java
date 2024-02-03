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
    public ListNode mergeNodes(ListNode head) {
        ListNode result= new ListNode(0);
        ListNode ptr = result;
        ListNode temp = head;
        temp=temp.next;
        int sum=0;
        while(temp!=null){
            while(temp.val!=0){
                sum+=temp.val;
                temp=temp.next;
            }
            ptr.next = new ListNode(sum);
            ptr=ptr.next;
            temp=temp.next;
            sum=0;
        }
        return result.next;
    }
}