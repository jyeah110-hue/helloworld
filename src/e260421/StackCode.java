package e260421;

import java.util.Stack;

public class StackCode {
    public static void main(String[] args) {
        //List일 경우에는 push/pop/... 사용안됨
        // List<Integer> stk = new Stack<Integer>();
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        Integer data = stk.pop();
        System.out.println("You popped: " + data);

        stk.push(40);
        while(!stk.isEmpty()) {
            System.out.println(stk.pop());
        }
    }
}
