class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode curr = head;
        int len = 0;
         while(curr!=null){
             len++;
             curr = curr.next;
         }
         if(len==1){
             return null;
         }
         int mid = len/2;
         curr = head;
         for(int i = 0;i<mid-1;i++){
             curr=curr.next;
         }
         curr.next = curr.next.next;
         return head;
    }
}
