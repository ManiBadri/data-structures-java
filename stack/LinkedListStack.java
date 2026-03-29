package stack;

public class LinkedListStack<T> {


    class Node<T>{
        T val;
        Node next;

        public Node(T val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    private Node<T> top;
    private int size;

    public LinkedListStack() {
        top = null;
        size = 0;
    }
    
    public void push(T item){
        Node newNode = new Node<T>(item, top);
        top = newNode;
        size++;
        
    }

    public Node pop(){
        if(top == null){
            throw new IllegalStateException("Stack is empty");
        }
        Node temp = top;
        top = top.next;
        size--;
        return temp;
    }

    public T top(){
        if(top == null){
            throw new IllegalStateException("Stack is empty");
        }
        return top.val;
    }

    public int size(){
        return size;
    } 

    public boolean search(T item){
        
        if(top == null){
            throw new IllegalStateException("Stack is empty");
        }

        Node q  = top;
        while(q.next != null){
            if(q.val != item){
                return true;
            }
        }
        return false;
    }

    public void clear(){
        top = null;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    
}
