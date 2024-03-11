/*public class Fibonacci{
    public static void main(String[] args) {
        int n=9;
        System.out.println(fib(n));
    }
    static int fib(int x){
        if(x<=1)
        return x;
      return fib(x-1) + fib(x-2);
    }
}
/*class Fibonacci {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String args[])
    {
        int n =5;
        System.out.println(
            n + "th Fibonacci Number: " + fib(n));
    }
}*/
// Linked list node
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

// Fibonacci calculator using recursion
class Fibonacci {
    // Recursive method to calculate the nth Fibonacci number
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Method to create a linked list containing Fibonacci numbers up to n
    static ListNode createFibonacciList(int n) {
        ListNode head = new ListNode(0);
        ListNode current = head;

        for (int i = 1; i <= n; i++) {
            current.next = new ListNode(fibonacci(i));
            current = current.next;
        }

        return head.next; // Skip the first node (0)
    }

    // Method to print the linked list
    static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10; // Change n to the desired Fibonacci number
        ListNode fibonacciList = createFibonacciList(n);
        System.out.println("Fibonacci sequence up to " + n + ":");
        printList(fibonacciList);
    }
}
