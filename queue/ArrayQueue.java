package queue;

public class ArrayQueue<T> {

    private T[] arr;
    private int head;
    private int tail;

    public ArrayQueue(int capacity) {
        arr = (T[]) new Object[capacity];
        head = -1;
        tail = 0;
    }


    public void queue(T item){
        if(head + 1 == tail && head != -1) //rework?
            throw new IllegalStateException("Queue full");
        if(head == arr.length - 1 && tail == 0)
            throw new IllegalStateException("Queue full");
        
        head++;
        if(head > arr.length)
            head = 0;
        arr[head] = item;
    }

    public T dequeue(){
        T temp = arr[tail];
        arr[tail] = null;
        tail++;
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