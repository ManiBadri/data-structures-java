package LinkedList;

public class test {

    public static void main(String[] args) {
        
        LinkedList<Integer> myList = new LinkedList<>();
        myList.insert(1);
        myList.insert(2);
        myList.insert(3);
        myList.insert(4);
        myList.insert(5);



        DoublyLinkedList<Integer> myDoublyList = new DoublyLinkedList<>();
        myDoublyList.insert(1);
        myDoublyList.insert(2);
        myDoublyList.insert(3);
        myDoublyList.insert(4);
        myDoublyList.insert(5);
        System.out.println("Start:");
        myDoublyList.iterator();
        myDoublyList.delete(3);
        System.out.println("After:");
        myDoublyList.iterator();
        System.out.println("found: " + myDoublyList.search(3));
        





    }


    
}
