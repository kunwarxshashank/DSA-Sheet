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


        if(type=="fragile"){
            addFirst();
        }else{
            addLast();
        }
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