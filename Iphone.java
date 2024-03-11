abstract class Iphone {
abstract void myName();
}
class Iphone11 extends Iphone{
    void myName(){
        System.out.println("I am Iphone 11");
    }
}
class Iphone12 extends Iphone{
    void myName(){
        System.out.println("I am Iphone 12");
    }
}
class Iphone13 extends Iphone {
    void myName(){
        System.out.println("I am Iphone 13");
    }
public static void main(String args[]){
    Iphone13 iph=new Iphone13();
    iph.myName();
}
}
