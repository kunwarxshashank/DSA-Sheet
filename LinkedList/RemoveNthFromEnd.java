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
        ListNode temp = head;
        ListNode newnode = head;
        int size = 0;

        // traversing a list
        while(temp!=null){
            size ++;
            temp = temp.next;
        }

        // remove nth node from last
        int remove = size-n+1;  // 4
    
        // Removing head
        if (remove == 1) {
            return head.next; // return null
        }

        // going to n-1 node then n-1
        for(int i=1; i<remove-1; i++){
           newnode = newnode.next;
        }

        // skip the nth node
        newnode.next = newnode.next.next;        
        return head;
    }
    
}