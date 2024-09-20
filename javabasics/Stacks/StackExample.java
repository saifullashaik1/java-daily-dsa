package javabasics.Stacks;

public class StackExample {
    private int[] stack;
    private int top;
    private int maxSize;
    public StackExample(int size){
        maxSize = size;
        stack = new int[maxSize];
        top = -1;

    }
    public  void push(int value){
        if(top == maxSize -1){
            System.out.println("stack is full, cant push" + value);
            return;
        }
        stack[++top] = value;
    }
    public int pop(){
        if (top == -1){
            System.out.println("stack is empty,cant pop");
            return  -1;
        }
        return stack[top--];

    }
    public int peek(){
        if (top == -1){
            System.out.println("stack is empty");
            return -1;

        }
        return stack[top];

    }
    public boolean isEmpty(){
        return  top == -1;

    }

}

class CustomStack {
    public static void main(String[] args) {
        StackExample stack = new StackExample(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("top element" + stack.peek());
        stack.pop();
        System.out.println("top emelent after pop" + stack.peek());

    }
}
