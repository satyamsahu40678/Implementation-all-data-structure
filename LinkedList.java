// class SinglyLinkedList{
//     static class ListNode{
//         int val;
//         ListNode next;
//         public ListNode(int val, ListNode next){
//             this.val = val;
//             this.next = null;
//         }
//     }

//     private ListNode head;

//     public void addAtHead(int val){
//         ListNode newNode = new ListNode(val, head);
//         newNode.next = head;
//         head = newNode;
//     }


//     public void addAtTail(int val){
//         ListNode newNode = new ListNode(val, null);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         ListNode temp = head;
//         while(temp.next != null){
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }

//     public void deleteNode(int val){
//         ListNode temp = head;
//         if(temp == null){
//             return;
//         }
//         while(temp.next != null){
//             if(temp.next.val == val){
//                 temp.next = temp.next.next;
//                 return;
//             }
//             temp = temp.next;
//         }
//     }

//     public void printLinkedList(){
//         ListNode temp = head;
//         while(temp != null){
//             System.out.print(temp.val + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
// }
//-------------------------------------------------------------------------------------------------------------------------------------------------
// class DoublyLinkedList{
//     static class ListNode{
//         int val;
//         ListNode prev;
//         ListNode next;
//         public ListNode(int val){
//             this.val = val;
//             this.prev = null;
//             this.next = null;
//         }
//     }

//     private ListNode head;
//     private ListNode tail;

//     public void addAtHead(int val){
//         ListNode newNode = new ListNode(val);
//         if(head == null){
//             head = tail = newNode;
//         }
//         else{
//             head.prev = newNode;
//             newNode.next = head;
//             head = newNode;
//         }
//     }

//     public void addAtTail(int val){
//         ListNode newNode = new ListNode(val);
//         if(tail == null){
//             head = tail = newNode;
//         }
//         else{
//             tail.next = newNode;
//             newNode.prev = tail;
//             tail = newNode;
//         }
//     }

//     public void deleteNode(int val){
//         if(head == null) return;

//         if(head.val == val){
//             head = head.next;
//             if(head != null){
//                 head.prev = null;
//             }
//             else{
//                 tail = null;
//             }
//             return;
//         }

//         ListNode temp = head;
//         while(temp != null && temp.val != val){
//             temp = temp.next;
//         }

//         if(temp != null){
//             if(temp.next != null){
//                 temp.next.prev = temp.prev;
//             }
//             else{
//                 tail = temp.prev;
//             }

//             if(temp.prev != null){
//                 temp.prev.next = temp.next;
//             }
//         }
//     }

//     public boolean findByNode(int val){
//         ListNode temp = head;
//         while(temp != null){
//             if(temp.val == val){
//                 return true;
//             }
//             temp = temp.next;
//         }
//         return false;
//     }

//     public void printLinkedList(){
//         ListNode temp = head;
//         while(temp != null){
//             System.out.print(temp.val + "<->");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public void reversePrintLinkedList(){
//         ListNode temp = tail;
//         while(temp != null){
//             System.out.print(temp.val + "<->");
//             temp = temp.prev;
//         }
//         System.out.println();
//     }
// }

//------------------------------------------------------------------------------------------------------------------------------------------------

class CircularLinkedList{
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    private ListNode head;

    public void addAtHead(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            head.next = head;
        }
        else{
            ListNode temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtTail(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            head.next = head;
        }
        else{
            ListNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }
    }


    public void deleteNode(int val){
        if(head == null) return;
        if(head.val == val){
            if(head.next == head){
                head = null;
            }
            else{
                ListNode temp = head;
                while (temp.next != head){
                    temp = temp.next;
                }

                temp.next = head.next;
                head = head.next;
            }
            return;
        }

        ListNode temp = head;
        while(temp.next != head && temp.next.val != val){
            temp = temp.next;
        }

        if(temp.next.val == val){
            temp.next = temp.next.next;
        }
    }

    public boolean findByNode(int val){
        if(head == null) return false;
        ListNode temp = head;
        while(temp.next != head){
            if(temp.val == val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void printLinkedList(){
        if(head == null) return;
        ListNode temp = head;

        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

}

public class LinkedList {
    public static void main(String[] args) {
        // System.out.println("Singly LinkedList");
        // SinglyLinkedList sl = new SinglyLinkedList();
        // sl.addAtHead(10);
        // sl.addAtHead(20);
        // sl.addAtHead(30);
        // sl.printLinkedList();
        // sl.addAtTail(40);
        // sl.addAtTail(50);
        // sl.printLinkedList();
        // sl.deleteNode(20);
        // sl.deleteNode(50);
        // sl.printLinkedList();
        // System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // System.out.println("Doubly LinkedList");
        // DoublyLinkedList dl = new DoublyLinkedList();
        // dl.addAtHead(10);
        // dl.addAtHead(20);
        // dl.addAtHead(30);
        // dl.printLinkedList();
        // dl.addAtTail(40);
        // dl.addAtTail(50);
        // dl.printLinkedList();
        // dl.deleteNode(20);
        // dl.deleteNode(50);
        // dl.printLinkedList();
        // dl.reversePrintLinkedList();
        // dl.findByNode(10);
        // dl.findByNode(20);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Circular LinkedList");
        CircularLinkedList cl = new CircularLinkedList();
        cl.addAtHead(10);
        cl.addAtHead(20);
        cl.addAtHead(30);
        cl.printLinkedList();
        cl.addAtTail(40);
        cl.addAtTail(50);
        cl.printLinkedList();
        cl.deleteNode(20);
        cl.deleteNode(50);
        cl.printLinkedList();
        System.out.println(cl.findByNode(10));
        System.out.println(cl.findByNode(20));
    }
}