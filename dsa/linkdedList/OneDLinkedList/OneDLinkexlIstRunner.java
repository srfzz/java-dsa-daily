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


    public void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }

    public void findLength(){
        int count=0;
        Node Current=head;
        while(Current != null){
            count++;
            Current=Current.next;
        }    
        System.out.println("Length of the linked list is: "+count);    
    }

    public void searchLinkedList(int key){
        Node current=head;
      while(current != null){
        if(current.data==key){
            System.out.println("Element found in the linked list: "+key);
            return;
        }
        current=current.next;
      }
      System.out.println("Element not found in the linked list: "+key);
    }
    public void Dislay(){
        Node current=head;
        while(current != null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
   
}
