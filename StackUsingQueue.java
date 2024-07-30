import java.util.*;

class Implement{
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public Implement(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int val){
        q1.add(val);
    }

    public int pop(){
        if(q1.isEmpty()){
            return -1;
        }
        while(q1.size() > 1){
            q2.add(q1.remove());
        }
        int elem = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return elem;
    }

    public boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        Implement q1 = new Implement();
        q1.push(10);
        q1.push(20);
        q1.push(30);
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.isEmpty());
    }    
}
