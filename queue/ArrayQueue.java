package queue;

public class ArrayQueue<T> {

    private T[] arr;
    private int head;
    private int tail;

    public ArrayQueue(int capacity) {
        arr = (T[]) new Object[capacity];
        head = -1;
        tail = -1;
    }


    public void queue(T item){
        if(head + 1 == tail) //rework?
            throw new IllegalStateException("Queue full");
        
        
        head++;
        if(head > arr.length)
            head = 0;
        arr[head] = item;
    }

    public T dequeue(){
        return null; //?
    }

    public T top(){
        return arr[tail];
    }

    public int search(T item){
        int p = head;
        while(p != tail){
            if(arr[p] == item)
                return p;
            else{
                p++;
                if(p > arr.length)
                    p = 0;
            }
        }
        return -1;
    }




}