class Animal{
    void makeSound(){
        System.out.println("Animals make sound");
    }
}
class Lion extends Animal{
void makeSound(){
    System.out.println("Lion Roars");
}
}
class Monkey extends Animal{
    void makeSound(){
        System.out.println("Monkey chatters");
    }
}
class Horse extends Animal{
    void makeSound(){
        System.out.println("Horse neighs");
    }
}
class Leopard extends Animal{
    void makeSound(){
        System.out.println("Leopard growls");
    }
public static void main(String args[]){
    Animal al=new Animal();
    Lion ln=new Lion();
    Monkey mk=new Monkey();
    Horse hs=new Horse();
    Leopard lp=new Leopard();
    al.makeSound();
    ln.makeSound();
    mk.makeSound();
    hs.makeSound();
    lp.makeSound();
}

}