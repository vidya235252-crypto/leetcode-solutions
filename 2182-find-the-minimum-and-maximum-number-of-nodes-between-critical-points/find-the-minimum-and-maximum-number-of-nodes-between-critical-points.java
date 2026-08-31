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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode prev=head,cur=head.next;
        int index=1;
        while(cur.next!=null){
            if((cur.val>prev.val && cur.val>cur.next.val)||(cur.val<prev.val && cur.val<cur.next.val))
            list.add(index);
            prev=cur;
            cur=cur.next;
            index++;
        }
        if(list.size()<2)
        return new int[]{-1,-1};
        int min=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            min=Math.min(min,list.get(i)-list.get(i-1));
        }
        int max=list.get(list.size()-1)-list.get(0);
        return new int[]{min,max};
    }
}