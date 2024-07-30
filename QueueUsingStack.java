import java.util.*;

class Implement{
    private Stack<Integer> st1;
    private Stack<Integer> st2;

    public Implement(){
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void enqueue(int val){
        st1.push(val);
    }

    public boolean isEmpty(){
        return st1.isEmpty() && st2.isEmpty();
    }

    public int dequeue(){
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        if(st2.isEmpty()){
            return -1;
        }
        return st2.pop();
    }

}

public class QueueUsingStack {
    public static void main(String[] args) {
        Implement im = new Implement();
        im.enqueue(10);
        im.enqueue(20);
        im.enqueue(30);
        System.out.println(im.dequeue());
        System.out.println(im.dequeue());
        System.out.println(im.dequeue());
        System.out.println(im.isEmpty());
    }

}
