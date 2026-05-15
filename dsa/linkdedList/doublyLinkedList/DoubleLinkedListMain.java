package dsa.linkdedList.doublyLinkedList;

public class DoubleLinkedListMain {
    public static void main(String[] args){
        DoubleLinkedListRunner doubleLinkedListRunner=new DoubleLinkedListRunner();
        doubleLinkedListRunner.insertAtTheHed(10);
        doubleLinkedListRunner.insertAtTheHed(20);
        doubleLinkedListRunner.insertAtTheHed(30);
        doubleLinkedListRunner.insertAtTheHed(40);
        doubleLinkedListRunner.display();
        doubleLinkedListRunner.deleteAtTheEnd();
        doubleLinkedListRunner.display();
        doubleLinkedListRunner.reverse();
        doubleLinkedListRunner.display();
    }

}
