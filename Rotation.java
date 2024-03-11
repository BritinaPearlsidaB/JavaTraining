import java.util.*;

 class Rotation {
public static void main(String[] args){
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    arr.add(5);
    System.out.println("Elements in the array:");
    System.out.println(arr);
    int rotation =4;
    for(int i=0;i<rotation;i++){
        int x=arr.remove(0);
        arr.add(x);
    }
    
System.out.println("Rotation:");
System.out.println(arr);
}} 


    

 


















