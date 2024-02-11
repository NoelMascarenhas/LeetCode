/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        HashMap<ListNode,Integer> map = new HashMap<>();
        while(temp1 != null){
            map.put(temp1,1);
            temp1=temp1.next;
        }
        ListNode temp2 = headB;
        while(temp2 != null){
            if(map.containsKey(temp2)){
                return temp2;
            }
            temp2=temp2.next;
        }
        return null;
    }
}