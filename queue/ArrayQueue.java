package queue;

public class ArrayQueue<T> {

    private T[] arr;
    private int head;
    private int tail;
    private int size;

    public ArrayQueue(int capacity) {
        arr = (T[]) new Object[capacity];
        head = -1;
        tail = 0;
        size = 0;
    }


    public void queue(T item){
        if(size == arr.length)
            throw new IllegalStateException("Queue is full");
        
        head++;
        size++;
        if(head + 1 == arr.length)
            head = 0;
        arr[head] = item;
    }

    public T dequeue(){
        if(size == 0)
            throw new IllegalStateException("Queue empty");

        T temp = arr[tail];
        arr[tail] = null;
        tail++;
        size--;
        return temp;
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