package dsa.linkdedList.OneDLinkedList;

public class OneDLinkedListMain {
   
    public static void main(String[] args){
         OneDLinkexlIstRunner list=new OneDLinkexlIstRunner();

//* imsertion at the ehad of the linked List */
               for(int i=0;i<10000;i++){
                list.InsertAtHead(i);
               }
                list.Dislay();

    /* deleetiopn of the headed of the link list     */
    list.deleteAtHead();
    list.Dislay();
    //* Find the length of the Linked List */
    list.findLength();

    /*Search in Linked List */
    list.searchLinkedList(20);
    }

}
