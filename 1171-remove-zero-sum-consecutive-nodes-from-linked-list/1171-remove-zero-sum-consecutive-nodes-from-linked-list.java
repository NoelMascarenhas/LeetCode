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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr=dummy;
        dummy.next=head;
        int prefixSum=0;
        Map<Integer,ListNode> map = new HashMap<>();
        while(curr!=null){
            prefixSum += curr.val;
            if(map.containsKey(prefixSum)){
                curr=map.get(prefixSum).next;
                int sum=prefixSum+curr.val;
                while(sum!=prefixSum){
                    map.remove(sum);
                    curr=curr.next;
                    sum+= curr.val;
                }
                map.get(prefixSum).next=curr.next;
            }else{
                map.put(prefixSum,curr);
            }
            curr=curr.next;
        }
        return dummy.next;
    }
}