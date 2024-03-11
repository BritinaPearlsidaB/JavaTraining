import java.util.HashSet;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public boolean detectLoop() {
        HashSet<Node> visitedNodes = new HashSet<>();
        Node currentNode = head;
        while (currentNode != null) {
            if (visitedNodes.contains(currentNode)) {
                return true;
            } else {
                visitedNodes.add(currentNode);
                currentNode = currentNode.next; // Update currentNode to the next node
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        linkedList.head.next = new Node(2);
        linkedList.head.next.next = new Node(3);
        linkedList.head.next.next.next = new Node(4);
        linkedList.head.next.next.next.next = new Node(5);

        // Create a loop
        linkedList.head.next.next.next.next.next = linkedList.head.next;

        boolean isLoopDetected = linkedList.detectLoop();
        if (isLoopDetected) {
            System.out.println("Loop detected");
        } else {
            System.out.println("No loop detected");
        }
    }
}
