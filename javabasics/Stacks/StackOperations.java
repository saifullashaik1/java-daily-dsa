package javabasics.Stacks;
import java.util.Stack;

public class StackOperations {
    public static void main(String[] args){
        //stack creation
        Stack<Integer> stack = new Stack<>();
        //pushing elements into stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // display the top element

        System.out.println("top element" + stack.peek());
        System.out.println("pop element" + stack.pop());
        System.out.println("is stack empty" + stack.isEmpty());


    }
}
