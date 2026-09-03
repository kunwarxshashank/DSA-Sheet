import java.util.HashMap;

class PackageSystem{

    class Packet{
            int pid;
            String sender;
            String reciever;
            String type;
            String destination;

            Packet(int pid, String sender, String reciever, String type, String destination){
                this.pid = pid;
                this.sender = sender;
                this.reciever = reciever;
                this.type = type;
                this.destination = destination;
            }
    }

    // doubly linkedlist
    class Node{
        Node prev;
        Node next;
        Packet packet;

        Node(Packet packet){
            this.packet = packet;
        }
    }



    HashMap<Integer, Packet> map = new HashMap<>();

    void ADD(int pid, String sender, String reciever, String type, String destination){

        // if already pid exist return
        if(map.containsKey(pid)){
            return;
        }

        Packet packet = new Packet(pid, sender, reciever, type, destination);

        Node node = new Node(packet);


        if(type=="fragile"){
            addFirst(node);
        }else{
            addLast(node);
        }
    }

    void addFirst(Node node){
        
    }

    void addLast(Node node){

    }



    void CANCEL(int pid){

        if(!map.containsKey(pid)){
            return;
        }

        // remove packet
        remove();
    }


    void DISPATCH(int pid){
        // dispatch
    }

    void LOOKUP(int pid){
        // lookup
    }


    



}