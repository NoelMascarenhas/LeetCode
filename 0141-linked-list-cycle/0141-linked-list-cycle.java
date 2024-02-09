/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
            if(map.containsKey(temp)){
                return true;
            }
            else{
                map.put(temp,1);
            }
            temp=temp.next;
        }
        return false;
        
    }
}