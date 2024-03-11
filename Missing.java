public class Missing{
    public static void main(String[] args) {
       /*int[] a={1,2,3,5,8,9};
       for(int i=0;i<a.length;i++){
            if(a[i]+1==a[i+1])
                continue;
            else if(a[i]+1!=a[i+1]){
                System.out.println(a[i]+1);
            }
        }*/
        int[] a={14,8,2,4,3};
        for(int i=0;i<a.length;i++){
            if(a[i]!=i)
            continue;
            else if(a[i]!=i){
            a[i]=i;
        }
        System.out.println(a[i]);
    }
}
}

