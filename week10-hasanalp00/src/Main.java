public class Main {
    public static void main(String[] args) {
        /*
        Stack stack=new StackArray();
        stack.push("StringObject");
        stack.push(3);
        stack.pop();
        stack.peek();
        stack.isEmpty();

         */
        StackLinkedList stack =new StackLinkedList();
        stack.peek();
        stack.push(2);
        stack.push("hasan");
        stack.peek();
        stack.pop();
        stack.peek();
        System.out.println(stack.top.getItem());
    }
}