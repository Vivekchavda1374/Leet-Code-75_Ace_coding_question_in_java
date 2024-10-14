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
    public int pairSum(ListNode head) {

        //finding middle

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }

        //reversing the node
        ListNode prev=null;
        ListNode curr=slow;

        while(curr!=null){

            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }



        // Checking maximum twin sum
        int max = 0;

        ListNode h1 = head;
        ListNode h2 = prev; // Reversed second half

        while (h1 != null && h2 != null) {
            int twinSum = h1.val + h2.val;
           // max = Math.max(max, twinSum);
            if (twinSum > max) {
                max = twinSum;
            }

            h1 = h1.next;
            h2 = h2.next;
        }

        return max;
        
    }
}
