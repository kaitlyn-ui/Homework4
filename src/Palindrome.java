
public class Palindrome extends LinkedList{

    public static void main(String[] args){
        Node head = null;

        //Different test cases

        //Is Palindrome
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);

        //Is Palindrome
        /*Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(20);
        Node d = new Node(10);*/

        //Is Not Palindrome
        /*Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(17);*/

        //creating linked list
        head = listInsert(head,a);
        head = listInsert(head,b);
        head = listInsert(head,c);
        head = listInsert(head,d);
        head = listInsert(head,e);

        boolean ans = isPalindrome(head);

        if(ans){
            System.out.println("True, Palindrome");
        } else{
            System.out.println("False, Not Palindrome");
        }

    }
    public static boolean checkPal(Node right){
        //base case to stop recursion
        if(right==null){
            return true;
        }

        //recursive call to check each node
        boolean result = checkPal(right.next);

        //If keys are different end recursion and return false
        if(!result){
            return false;
        }

        //compare the left & right
        if(left.key != right.key){
            return false;
        }

        left = left.next;

        return true;

    }
    private static Node left;
    public static boolean isPalindrome(Node head){
        left = head;
        return checkPal(head); //call to recursive helper
    }



}
