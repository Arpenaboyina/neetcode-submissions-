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

       if(head == null) return null;

       ListNode start=head;
       ListNode end=head;

       int count=1;

       while(end.next != null && count < n)
       {
         end=end.next;
         count++;
       }

       //remove head

       if(end.next == null && count == n)
       {
        return head.next;
       }

       while(end.next.next != null)
       {
        start =start.next;
        end=end.next;
       }

       start.next=start.next.next;

       return head;
    }
}
