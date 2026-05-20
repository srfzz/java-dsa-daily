package dsa.linkdedList.OneLinkedListMedium;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
public class OneLinkedListMeduimSolution {
private Node head;
    /** Inserting At The Head of the Node  */
    public void  insertNodeAtHead(int data){

        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void displayNode(){
       if(head == null){
        System.out.println("List Is Empty");
        return;
       }
       Node current = head;
       while(current != null){
        System.out.print(current.data+"->");
        current=current.next;
       }
       System.out.println("null");
       
    }

    //** middle of the lonkd list Middle of a LinkedList [TortoiseHare Method]*/
    public void findMiddleOftheLinkedList(){
        if(head == null){
            System.out.println("ist id Empty");
        }
        Node slow= head;
        Node fast=head;
        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Middle of The Linked Lost is :"+slow.data);
    }




}
