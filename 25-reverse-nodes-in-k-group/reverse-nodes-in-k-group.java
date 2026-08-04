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
    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while (true) {
            ListNode end = getKthNode(prev, k);
            if (end == null) break;
            ListNode next = end.next;
            ListNode start = prev.next;
            ListNode newhead = reverseGroup(start, k);
            prev.next = newhead;
            start.next = next;
            prev = start;
        }
        return dummy.next;
    }
    private ListNode getKthNode(ListNode cur, int k){
        while(cur!=null && k>0){
            cur=cur.next;
            k--;
        }
        return cur;
    }
    private ListNode reverseGroup(ListNode cur, int k){
        ListNode prev=null;
        for(int i=0;i<k;i++){
            ListNode nexttemp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nexttemp;
        }
        return prev;
     }
}