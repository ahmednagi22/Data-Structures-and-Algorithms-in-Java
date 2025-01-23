package DataStructures;

public class MyStack {
    private int[] stack;
    private int maxSize;
    private int top;

    // stack constructor
    public MyStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[maxSize];
        top = -1;
    }

    // add element in the stack
    public void push(int value){
        if (top == maxSize-1){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top]=value;
        System.out.println(value + " pushed into the stack");
    }
    // remove element from the top of stack
    public int pop(){
       if (top == -1){
           System.out.println("Stack underflow");
           return -1;
       }
        int result = stack[top];
        top--;
        System.out.println(result + " popped from the stack");
        return result;
    }
    // function to peek the top of the stack
    public int peek(){
        if(top ==-1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }
    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }


}
