package dsa.linkdedList.doublyLinkedList;
class DoubleLLNode{
     int data;
    DoubleLLNode next;
    DoubleLLNode prev;  
    public DoubleLLNode(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DoubleLinkedListRunner {
   private DoubleLLNode head;
   private DoubleLLNode tail;
 public void insertAtTheHed(int data){
    DoubleLLNode newNode=new DoubleLLNode(data);
    if(head == null){
        head=newNode;
        tail=newNode;
    }else
    {
    newNode.next=head;
    head.prev=newNode;
    head=newNode;
    }
   
 }
   
   public void display(){
    DoubleLLNode current=head;
    while(current!=null){
        System.out.print(current.data+"<-> ");
        current=current.next;
    }
    System.out.println();
   }
   public void deleteAtTheEnd(){
   if(head == null) throw new RuntimeException("List is empty");
   if(head == tail){
    head=null;
    tail=null;
   }else{
    DoubleLLNode temp=head;
    head=head.next;
    head.prev=null;
    temp.next=null;
   }
   }

   /* Reverse a Doubly Linked List */
   public void reverse(){
    if(head==null) throw new RuntimeException("List is empty");
    DoubleLLNode current=head;
    DoubleLLNode temp=null;

    while(current!=null){
       temp=current.prev;
       current.prev=current.next;
       current.next=temp;
       current=current.prev;
    }
   temp=head;
   head=tail;
   tail=temp;
   }
}

        
   

