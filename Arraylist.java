import java.util.*;
class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        //Add
        al.add(1);
        al.add(3);
        al.add(5);
        al.add(7);
        al.add(9);
        //Iterator
        System.out.println("Elements in the array:");
       for(int i=0;i<4;i++){
            System.out.println(al.get(i)) ;
        
        if(al.get(i)==7){
            al.remove(i);
        }
            
    }
    }
    }

    
