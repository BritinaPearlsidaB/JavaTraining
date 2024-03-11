public class Recursion {
   public static void main(String[] args) {
    int n=5;
    open(n);
    //close(n);
   }
    static void open(int n){
        if(n==0)
        return;
        System.out.println("Open "+n);
        open(n-1);
        System.out.println("Closed "+n);
        open(n-1);
    }
  /*  static void close(int n){
        if(n==0)
        return;
        System.out.println("Closed "+n);
        close(n-1);
    }
*/


}
