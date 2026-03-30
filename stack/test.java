package stack;

public class test {

    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.clear();





        ArrayStack<Integer> arrStack = new ArrayStack<>(10);
        arrStack.push(5);
        arrStack.push(6);
        arrStack.push(7);
        arrStack.push(8);
        arrStack.pop();

        System.out.println();
        System.out.print(arrStack.top());
        System.out.println();
        
    }

}
