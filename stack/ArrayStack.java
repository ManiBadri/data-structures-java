package stack;

public class ArrayStack<T> {

    private T[] arr;
    private int top;

    public ArrayStack(int capacity) {
        arr = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T item){
        if(top == arr.length)
            throw new IllegalStateException("Stack full");
        arr[top+1] = item;
        top++;
    }

    public T top(){
        return arr[top];
    }

    public T pop(){
        if(top == -1)
            throw new IllegalStateException("Stack empty");
        T temp = arr[top];
        arr[top] = null;
        top--;
        return temp;
    }

    public void clear(){
        for(int i = 0; i < arr.length; i++){
            arr[i] = null;
        }
    }
    
}
