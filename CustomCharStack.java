class CustomCharStack {
    private char[] stackArray;
    private int top;
    private int maxSize;

    public CustomCharStack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

 class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        int length = str.length();
        CustomCharStack stack = new CustomCharStack(length);

        for (int i = 0; i < length; i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "radar";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
