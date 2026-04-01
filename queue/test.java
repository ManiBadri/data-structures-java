package queue;

public class test {

    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();

        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);

        System.out.println();
        
        queue.clear();




        ArrayQueue arr = new ArrayQueue<Integer>(10);
        arr.queue(10);
        System.out.print("Top: " + arr.top());

        
    }
    

}
