import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> teaStack = new LinkedList<>();
        // Adding elements to the stack
        teaStack.push(20);
        teaStack.push(13);
        teaStack.push(89);
        teaStack.push(90);
        teaStack.push(90);
        teaStack.push(11);
        teaStack.push(45);
        teaStack.push(18);

        // Displaying the contents of the stack
        System.out.println("Element Stack: " + teaStack);


    }

}