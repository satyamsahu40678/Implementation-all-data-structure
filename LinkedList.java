class SinglyLinkedList{
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = null;
        }
    }

    private ListNode head;

    public void addAtHead(int val){
        ListNode newNode = new ListNode(val, head);
        newNode.next = head;
        head = newNode;
    }


    public void addAtTail(int val){
        ListNode newNode = new ListNode(val, null);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteNode(int val){
        ListNode temp = head;
        if(temp == null){
            return;
        }
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void printLinkedList(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class DoublyLinkedList{
    
}

public class LinkedList {
    public static void main(String[] args) {
        System.out.println("Singly LinkedList");
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.addAtHead(10);
        sl.addAtHead(20);
        sl.addAtHead(30);
        sl.printLinkedList();
        sl.addAtTail(40);
        sl.addAtTail(50);
        sl.printLinkedList();
        sl.deleteNode(20);
        sl.deleteNode(50);
        sl.printLinkedList();
        System.out.println();

        System.out.println("Doubly LinkedList");
        DoublyLinkedList dl = new DoublyLinkedList();
    }
}