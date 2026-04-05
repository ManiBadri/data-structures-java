package LinkedList;

public class DoublyLinkedList<T> {

    class Node<T>{
        Node next;
        Node prev;
        T val;
        public Node(Node prev, Node next,T val){
            this.next = next;
            this.prev = prev;
            this.val = val;
        }
    }

    private Node<T> head;

    DoublyLinkedList(){
        head = null;
    }

    public void insert(T item){
        if(head == null)
            head = new Node<T>(null, null, item);
        else{
            Node q = head;
            while(q.next != null)
                q = q.next;
            q.next = new Node<T>(q, null, item);
        }
    }

    public void delete(T item){
        Node q = head;
        while(q.val != item){
            if(q != null)
                return;
            q = q.next;
        }
        q = q.prev;
        q.next = q.next.next;
    }

    public void iterator(){
        Node q = head;
        while(q != null){
            System.out.println(q.val);
            q = q.next;

        }
        
    }

    public boolean search(T item){
        Node q = head;
        while(q != null){
            if(q.val == item)
                return true; 
        }
        return false;
    }
    
}
