class ListNode{
    int data; // data
    ListNode next; // reference

    // constructor banaya hai jo ki node create krega
    // isme jo v node create hoga uska data store krna hai aur reference null hoga by defult
    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class SimpleInsert {
    public static void main(String[] args) {

        // creating first node named head
        ListNode head = new ListNode(0);

        // creating second node named second
        ListNode second = new ListNode(1);

        // Linking first node to second
        head.next = second;

        // print values
        System.out.println("First Node data: "+head.data);
        System.out.println("Second node data: "+head.next.data);


    }
}
