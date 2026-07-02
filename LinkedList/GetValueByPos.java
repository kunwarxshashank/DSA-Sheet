class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}



class GetValueByPos {
    public static void main(String[] args) {
        Node node1 = new Node(0);
        Node node2 = new Node(1);
        Node node3 = new Node(2);
        Node node4 = new Node(3);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;


        // get position at 2
        Node head;
        node1.next = head;
    }
}