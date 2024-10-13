
class Solution {
    public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode Curr = head;
    while(Curr !=null){
        ListNode next = Curr.next;
        Curr.next = prev;
        prev = Curr;
        Curr = next;
    }   
    return prev;
    }
}
