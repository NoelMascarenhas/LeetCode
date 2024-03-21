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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1, an=null, bn=null;
        int index=0;
        while(temp!=null){
            if(index==a-1){
                an=temp;
            }
            else if(index==b+1){
                bn=temp;
            }
            index++;
            temp=temp.next;
        }
        an.next=list2;
        getTail(list2).next=bn;
        return list1;
    }
    public ListNode getTail(ListNode node){
        while(node.next!=null){
            node=node.next;
        }
        return node;
    }
}