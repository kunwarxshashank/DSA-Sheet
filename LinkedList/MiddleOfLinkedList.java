class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    int middleLinkList(){
     return 0;   
    }

}
public class MiddleOfLinkedList{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.middleLinkList());
    }
}