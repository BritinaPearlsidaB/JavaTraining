import java.util.ArrayDeque;

public class Stack {
    public static void main(String[] args) {
        ArrayDeque <String> stack=new ArrayDeque<>();
        stack.add("Brit");
        stack.add("Jas");
        stack.add("Nisha");
        stack.add("Swami");
        stack.add("Annie");
        stack.push("Mee");

        System.out.println(stack);
    }
}
