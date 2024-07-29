import java.util.*;

// class SimpleStack {
//     Stack<Integer> st = new Stack<>();
//     public void pushStack(int val) {
//         st.push(val);
//     }

//     public int popStack() {
//         if (st.isEmpty()) {
//             return -1;
//         }
//         return st.pop();
//     }

//     public int peekVal() {
//         if (st.isEmpty()) {
//             return -1;
//         }
//         return st.peek();
//     }

//     public boolean isEmptyStack() {
//         return st.isEmpty();
//     }

//     public int sizeStack() {
//         return st.size();
//     }
// }
// -----------------------------------------------------------------------------------------------------------------------------------------------

// class StackUsingArray{
//     ArrayList<Integer> arrayList = new ArrayList<>();
//     public void pushStack(int val){
//         arrayList.add(val);
//     }

//     public int popStack(){
//         if(arrayList.isEmpty()){
//             return -1;
//         }
//         return arrayList.remove(arrayList.size() - 1);
//     }

//     public int peekVal(){
//         if(arrayList.isEmpty()){
//             return -1;
//         }
//         return arrayList.get(arrayList.size() - 1);
//     }

//     public boolean isEmptyStack(){
//         return arrayList.isEmpty();
//     }

//     public int sizeStack(){
//         return arrayList.size();
//     }
// }

//------------------------------------------------------------------------------------------------------------------------------------------------

class StackUsingLinkedList{
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private Node head;

    public void pushStack(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public int popStack(){
        if(head == null){
            return -1;
        }
        int val = head.val;
        head = head.next;
        return val;
    }

    public int peekVal(){
        if(head == null){
            return -1;
        }
        return head.val;
    }

    public boolean isEmptyStack(){
        return head == null;
    }

    public int sizeStack(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class Stack {
    public static void main(String[] args) {
        // SimpleStack ss = new SimpleStack();
        // ss.pushStack(10);
        // ss.pushStack(20);
        // ss.pushStack(30);
        // System.out.println(ss.popStack());
        // System.out.println(ss.peekVal());
        // System.out.println(ss.isEmptyStack());
        // System.out.println(ss.sizeStack());

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // StackUsingArray sa = new StackUsingArray();
        // sa.pushStack(10);
        // sa.pushStack(20);
        // sa.pushStack(30);
        // System.out.println(sa.popStack());
        // System.out.println(sa.peekVal());
        // System.out.println(sa.isEmptyStack());
        // System.out.println(sa.sizeStack());

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        StackUsingLinkedList sl = new StackUsingLinkedList();
        sl.pushStack(10);
        sl.pushStack(20);
        sl.pushStack(30);
        System.out.println(sl.popStack());
        System.out.println(sl.peekVal());
        System.out.println(sl.isEmptyStack());
        System.out.println(sl.sizeStack());

    }
}
