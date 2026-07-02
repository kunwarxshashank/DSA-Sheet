class Node{
    int data;
    Node next;
    Node head;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    void add(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    

    int getDuplicate(Node head){
        Node slow = head;
        Node fast = head;

        while (true) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return slow.data;
            }
        }
    }
}

class Duplicate {
    public static void main(String[] args) {

        // adding element into linkedlist
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(2);
        System.out.println(list.getDuplicate(list.head));

    }
}