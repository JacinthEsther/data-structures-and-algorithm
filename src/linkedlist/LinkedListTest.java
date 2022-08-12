package linkedlist;

public class LinkedListTest
{
    public static void main(String args[])
    {
        //creating a LinkedList
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();
        linkedList.add( new LinkedList.Node("Apple"));
        linkedList.add( new LinkedList.Node("Mango"));
        linkedList.add( new LinkedList.Node("Orange"));
        linkedList.add( new LinkedList.Node("Gauva"));
        linkedList.add( new LinkedList.Node("Litchi"));
        //finding middle element of LinkedList in single pass
        LinkedList.Node current = head;
        int length = 0;
        LinkedList.Node middle = head;
        while(current.next() != null){
            length++;
            if(length%2 ==0){
                middle = middle.next();
            }
            current = current.next();
        }
        if(length%2 == 1){
            middle = middle.next();
        }
        System.out.println("The middle element of the Linked List: "+ middle);
    }

//    Start
//    Create a linked list of string types using the linked list data structure.
//    Now add elements to the linked list.
//    First, find the length of the linked list.
//    Use two pointers for the same.
//    The first pointer will increment on each iteration whereas the second pointer will be
//    incremented every second iteration.
//    When the first pointer will point to the end of a linked list,
//    the second pointer will be pointing to the middle element of the linked list.
//    Print the middle element.
//    Stop.

}
class LinkedList{
    private Node head;
    private Node tail;
    public LinkedList(){
        this.head = new Node("head");
        tail = head;
    }
    public Node head(){
        return head;
    }
    public void add(Node node){
        tail.next = node;
        tail = node;
    }
    public static class Node{
        private Node next;
        private String data;
        public Node(String data){
            this.data = data;
        }
        public String data() {
            return data;
        }
        public void setData(String data) {
            this.data = data;
        }
        public Node next() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        public String toString(){
            return this.data;
        }
    }
}
