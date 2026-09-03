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
    public ListNode RemoveNth(ListNode head, int n) {
       ListNode temp = head;

       // agar 1st element ya head nikalna hua to
       if(n==1){
        return head.next; // return null
       }
       
       int pos = 1;
       while(pos<n-1){
        pos++;
        temp = temp.next;
       }

       temp.next = temp.next.next;
       return head;
    }
}
