class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}
 
public class DetectCycle {
    public boolean hasCycle(ListNode head) {

        // check agar list ki length = 0 ya 1 ho to cycle nhi hoga
        if (head == null || head.next == null)
            return false;

        // starting me pointer head me rhenge
        ListNode slow = head;
        ListNode fast = head;

        // jab tak fast null tak nhi phuch jata 
        while(fast!=null && fast.next!=null){

            // fast ko 2 point move kro
            fast = fast.next.next;

            // slow ko 1 point move kro
            slow = slow.next;

            // agar fast aur slow ek jgh meet krte hai to cycle hai
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}