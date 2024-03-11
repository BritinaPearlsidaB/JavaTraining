import java.util.*;

public class MinMax {
    public static void main(String args[]){
    ArrayList<Integer> array=new ArrayList<>();
    array.add(1);
    array.add(0);
    array.add(-2);
    array.add(3);
    array.add(-9);
    array.add(11);
    array.add(3);
    array.add(1);
    int min=array.get(0);
    int max=array.get(1);
    for(int i=1;i<array.size();i++){
        if(array.get(i)<min){
            min=array.get(i);
        }
        if(array.get(i)>max){
            max=array.get(i);
        }
        }
        System.out.println("Minimum value:"+min);
        System.out.println("Maximum value:"+max);
    }
}
