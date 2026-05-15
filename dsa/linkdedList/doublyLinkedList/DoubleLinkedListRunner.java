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

}
