import java.util.Arrays;
class Node{
    int data;
    Node next;
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
class LinkedListCustom 
{

    static Node createSinglyLinkedListBackward(int[] input){
        Node head = null;
        Node future = null;
        for(int i = input.length-1;i>=0;i--){
            head = new Node(input[i],future);
            future = head;
        }

        return head;
    }
    public static void main(String[] args){
        int[] x = {1,5,7,9};
        System.out.println(Arrays.toString(x));
        Node head = createSinglyLinkedListBackward(x);
        for(Node temp = head;temp!=null;temp = temp.next){
            System.out.println(temp.data);
        }    
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            Node tail=temp;
            tail.next=head.next;


        }

}
}


