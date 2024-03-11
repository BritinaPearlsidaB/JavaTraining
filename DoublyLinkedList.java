/*import java.util.Arrays;
class DoublyLinkedList{
    int data;
    DoublyLinkedList prev;
    DoublyLinkedList next;
    public DoublyLinkedList(int data, DoublyLinkedList prev, DoublyLinkedList next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
class DoubleLL{
    static DoublyLinkedList DllBackward(int[] input){
        DoublyLinkedList head = null;
        DoublyLinkedList future = null;
        for(int i = input.length-1;i>=0;i--){
            head = new DoublyLinkedList(input[i],future);
            future = head;
        }

        return head;
    }


    public static void main(String args[]){
        int [] x = {5,2,8,3};
        System.out.println(Arrays.toString(x));
        DoublyLinkedList head= DllBackward(x);
        for(DoublyLinkedList  temp = head;temp!=null;temp = temp.next){
            System.out.println(temp.data);
        }
    }
}*/
import java.util.Arrays;

class DoublyLinkedList {
    int data;
    DoublyLinkedList prev;
    DoublyLinkedList next;

    public DoublyLinkedList(int data, DoublyLinkedList prev, DoublyLinkedList next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

class DoubleLL {
    static DoublyLinkedList DllBackward(int[] input) {
        DoublyLinkedList head = null;
        DoublyLinkedList future = null;
        for (int i = input.length - 1; i >= 0; i--) {
            head = new DoublyLinkedList(input[i], null, future);
            if (future != null) {
                future.prev = head;
            }
            future = head;
        }
        return head;
    }

    public static void main(String args[]) {
        int[] x = {5, 2, 8, 3};
        System.out.println(Arrays.toString(x));
        DoublyLinkedList head = DllBackward(x);
        for (DoublyLinkedList temp = head; temp != null; temp = temp.next) {
            System.out.println(temp.data);
        }
    }
}
