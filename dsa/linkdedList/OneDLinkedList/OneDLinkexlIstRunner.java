package dsa.linkdedList.OneDLinkedList;


class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
     }

public class OneDLinkexlIstRunner {
    private Node head;


    public void InsertAtHead(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void Dislay(){
        Node current =head;
        while(current != null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
   
}
