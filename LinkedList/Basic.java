/*
Size of linkest list is dynamic can grow or shrink at run time
maintain order when implemented
multiple duplicate element can be added


*/
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    void insertFirst(int data) {
        Node newnNode = new Node(data);
        head = newnNode;
    }
    

    void insert(int data) {

        Node newNode = new Node(data);

        if(head==null){
            
        }

    }

    void displayList() {
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }

        System.out.print("NULL\n");
    }
}

public class Basic {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        // inserting first
        list.insertFirst(0);
        // insert next
        list.insert(1);
        list.insert(2);
        // display
        list.displayList();

    }
}
