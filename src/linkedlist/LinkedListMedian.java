package linkedlist;

import java.util.LinkedList;

public class LinkedListMedian {
    LinkedListMedian next;
    int data;
    int counter=0;
    int middleNode(LinkedListMedian head){
        LinkedListMedian pointer = head;
        while(pointer!= null){
            pointer=pointer.next;
            counter++;
        }

        pointer = head;
        int halfCounter = 0;
        while(halfCounter < counter/2){
            pointer=pointer.next;
            halfCounter++;
        }
        return pointer.data;
    }

    int middleNode1(LinkedListMedian head) {
        LinkedListMedian slow = head;
        LinkedListMedian fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        assert slow != null;
        return slow.data;
    }

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        int middleNumber =0;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.size() % 2==1){
             middleNumber   = numbers.get(numbers.size()/2);
            }
            else {
                 middleNumber = numbers.get((numbers.size()/2));


            }
        }
        System.out.println(middleNumber);
    }

}
//    Create a pointer p, pointing to the head.
//    Iterate over the linked list until p reaches
//    to the end of the linked list, thereby find the length of the list.
//    Set p to head again. Now, increment p length/2 times.
//    Now, the p is at the middle of the linked list node. Return the value at p