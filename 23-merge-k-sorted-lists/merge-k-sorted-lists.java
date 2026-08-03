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
    public ListNode mergeKLists(ListNode[] lists) {
        int k=lists.length;
        ListNode[] current=new ListNode[k];
        for(int i=0;i<k;i++){
            current[i]=lists[i];
        }
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        while(true){
            int minindex=-1;
            for(int i=0;i<k;i++){
                if(current[i]==null)
                continue;
                if(minindex==-1 || current[i].val<current[minindex].val){
                    minindex=i;
                }
            }
            if(minindex==-1) break;
                tail.next=current[minindex];
                tail=tail.next;
                current[minindex]=current[minindex].next;
        }
        return dummy.next;
    }
}