import Algorithms.Search;
import Algorithms.Sort;
import DataStrucures.MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());

    }
}