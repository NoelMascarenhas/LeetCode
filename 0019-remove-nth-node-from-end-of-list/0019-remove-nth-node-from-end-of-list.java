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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count=0;
        while(temp != null){
            count++;
            temp= temp.next;
        }
        if(count == n){
            ListNode curr = head.next;
            head=null;
            return curr;
            
        }
        temp = head;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int steps = count-n;
        for(int i=0;i<steps;i++){
            curr.next=temp;
            temp=temp.next;
            curr=curr.next;
        }
        ListNode nextNode = temp.next;
        temp=null;
        curr.next=nextNode;
        return dummy.next;
    }
}