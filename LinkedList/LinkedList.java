package LinkedList;

public class LinkedList<T> {
    
    class Node<T>{
        T val;
        Node next;
        public Node(T val, Node next){
            this.val = val;
            this.next = next;

        }

    }

    private Node<T> head;
    //private int size;

    public void LinkedList(){
        head = null;
    }

    public void insert(T item){
        if(head == null)
            head = new Node<T>(item, null);
        else{
            Node q = head;
            while(q.next != null){
                q = q.next;
            }
            q.next = new Node<T>(item, null);
        }

    }

    public void delete(T item){
        Node q = head;
        Node p = head;
        while(q.val != item){
            if(q.next == null)
                return;
            q = q.next;
        }
        while(p.next != q)
            p = p.next;
        q = q.next;
        p.next = q;

    }

    public boolean search(T item){
        Node q = head;
        while(q.next == null){
            if(q.val == item)
                return true;
        }
        return false;
    }

    public boolean isEmpty(){
        return (head == null);
    }


    public void iterator(){
        Node q = head;
        while(q != null){
            System.out.println(q.val);
            q = q.next;
        }
    }

    

}
