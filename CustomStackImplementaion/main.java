package MyStack;

public class main {
    public static void main(String[] args) throws CustomStackException {
        CustomStack stack = new CustomStack(15);

        stack.push(7);
        stack.push(4);
        stack.push(3);
        stack.push(44);
        stack.push(33);
        stack.push(55);
        stack.push(66);
        stack.push(77);
        stack.push(99);
        stack.push(11);
        stack.push(343);

        System.out.println(stack.isFull());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());

    }
}
