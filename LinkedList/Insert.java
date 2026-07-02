class Node {
    int data;
    Node next;

    // constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node Last;
    Node temp;

    void add(int data) {
        // inserting data into new node
        Node node = new Node(data);
        if (head == null) {
            head = node;
            temp = node;
        } else {
            temp.next = node;
            temp = node;
        }

    }

    void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        if (temp == null) {
            temp = node;
        }
    }

    void InsertAtPos(int data, int position) {
        Node node = new Node(data);
        Node temp = head; // null

        if (position == 0) {
            addFirst(data);
            return;
        }
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

    }

    void InsertAtLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            temp = node;
        }else{
            temp.next = node;
            node = temp;
        }
    }

//  0 - 1 - 2 - 3 -4
    void DeleteAtPos(int position){
        Node temp = head;
        Node newnode = head;

        if(position==0){
            deleteFirst();
            return;
        }

        for (int i = 0; i < position-1; i++) {
            temp = temp.next;
            newnode = temp.next.next; // 3
        }

        temp.next = newnode; // 
    }

    void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
    }


    void deleteLast(){
        Node temp = head;

        // if list is empty
        if(head==null){
            return;
        }
        // if list is 2 size
        if(head.next==null){
            head=null;
            temp = null;
            return;
        }
        while (temp.next.next!=null) {
            temp = temp.next;
        }

        temp.next = null;
    }



    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

}

class Insert {
    public static void main(String[] args) {

        // adding element in first position
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(4);
        list.addFirst(0);
        list.InsertAtPos(3, 3);
        list.InsertAtLast(5);
        // list.deleteLast();
        list.DeleteAtPos(4);
        list.display();
    }
}