

class Node {
    int val;
    Node next;

    // ye constructor ek node ki value assign kr rha
    Node(int val) {
        this.val = val;
        this.next = null;
    }

}


public class StartCycle {
    // ek DetectCycle method banao Node class ki jo Node return kare

    public Node DetectCycle(Node head){
        Node slow = head;
        Node fast = head;

        // detect cycle
        while (fast!=null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next;

            // aagr slow and fast equal hai to find start cycle
            if(slow == fast){
                // ek pointer lenge jise head se badhaenge
                // aur slow ko meeting point se

                Node ptr = head;
                while (ptr!=slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }

        return null;
    }
}