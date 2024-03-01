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
    public ListNode middleNode(ListNode head) {
        //brute force solution -> count no. of nodes by traversing through list and the use another for loop to go till the middle element
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<count/2;i++){
            temp=temp.next;
        }
        return temp;
    }
}