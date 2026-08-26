import java.io.*;
import java.util.*;

class Node{
    // doubly linkedlist
    int data;
    Node prev;
    Node next;

    Node(int data, Node prev, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}


public class LRU{

    public void removeLast(Node node){

    }

    public void addFirst(Node node){

    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken()); // input 3 9
        int n = Integer.parseInt(st.nextToken()); // st.nextToken() for same line

        // for new line input
        
        // int c = Integer.parseInt(br.readLine());
        // int n = Integer.parseInt(br.readLine());

        Node node = new Node

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            // reading input line from br.readLine();
            String line = br.readLine();
            // converting each line into different parts array seprated by space
            String parts[] = line.split(" ");

            if(parts[0].equals("FETCH")){
                int chunkId = Integer.parseInt(parts[1]);
                // if chunk already exist
                removeLast();

            }else{
               
                
            }
        }
        System.out.println(sb);
        
    }
}