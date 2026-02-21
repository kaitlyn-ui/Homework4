public class LinkedList {

    public static class Node {
        int key;
        Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }

        public Node(){
            this.next = null;
            key = 0;
        }
    }

    public static Node listInsert(Node head, Node x){
        x.next = head; //moving pointers
        head = x;
        return head;
    }

    public static Node listSearch(Node head, int key){
        Node current = head;
        //loops until key is found in list, returns null if not found
        while(current != null){
            if(key == current.key){
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public static Node listDelete(Node head, Node x){
        Node current = head;

        //case where head is deleted node
        if(head == x){
            return head.next;
        }

        //case where list is empty
        if (head == null){
            return null;
        }

        //case where traversal of the linked list is needed to find the node for deletion
        while(current.next != null){
            if(current.next == x){
                current.next = x.next;
                break;
            }
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        //empty list
        Node head = null;

        //nodes
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(6);
        Node e = new Node(3);

        //node insertion
        head = listInsert(head, a);
        head = listInsert(head, b);
        head = listInsert(head, c);
        head = listInsert(head, d);
        head = listInsert(head, e);


        Node element = listSearch(head, 4);

        //if node is found, prints key, otherwise prints null
        if (element != null) {
            System.out.println("Node found: " + element.key);
        } else {
            System.out.println("Node not found");
        }

        printList(head);

        listDelete(head, b); //deletes integer 5

        printList(head);

    }

    //method to help print list
    static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.key + " ");
            current = current.next;
        }
        System.out.println();
    }

}

