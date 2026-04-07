package queue;

public class LinkedListQueue<T> {

    class Node<T>{
        T val;
        Node next;

        public Node(T val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    private Node<T> head;
    private int size;

    public LinkedListQueue() {
        head = null;
        size = 0;
    }

    public void enqueue(T item){
        Node newNode = new Node<T>(item, head);
        head = newNode; 
    }

    public T top(){
        if(head == null){
            throw new IllegalStateException("Queue is empty");
        }
        return head.val;
    }

    public Node dequeue(){
        if(head == null){
            throw new IllegalStateException("Queue is empty");
        }

        Node q = head;

        while(q.next.next != null){
            q = q.next;
        }

        Node p = q.next;

        q.next = null;
        return p;
    }

    public void clear(){
        head = null;
    }


    public boolean isEmpty(){
        return (head == null);
    }

    

}
