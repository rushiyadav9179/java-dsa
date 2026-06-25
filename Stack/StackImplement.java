package Stack;

import java.util.ArrayList;

class Mystack {
    ArrayList<Integer> list;
    public Mystack() {
        list = new ArrayList<Integer>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        if (list.size() == 0) {
            return -1;
        }
        return list.remove(list.size() - 1);
    }

    public int top() {
        if(list.size() == 0) {
            return -1;
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}

public class StackImplement {
    public static void main(String[] args) {
        Mystack stack = new Mystack();

        stack.push(10);
        stack.push(20);  
        stack.push(30);
        stack.push(40);

        System.out.println("Top element: " + stack.top());
        System.out.println("stack pop: " + stack.pop());
        System.out.println("Top element: " + stack.top());

        System.out.println("Stack is empty: " + stack.isEmpty());

        System.out.println("Stack size: " + stack.size());

        System.out.println("stack pop: " + stack.pop());
        System.out.println("stack pop: " + stack.pop());
        System.out.println("stack pop: " + stack.pop());

        System.out.println("Stack size: " + stack.size());

        System.out.println("Stack is empty: " + stack.isEmpty());

    }
}
