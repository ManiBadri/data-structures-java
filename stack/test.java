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

        System.out.println("");
        System.out.print("Top:");
        System.out.print(stack.top());
        System.out.println("");
        
    }

}
