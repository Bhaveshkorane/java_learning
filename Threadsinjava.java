class A{
    void print()
    {
        for(int i=0;i<10;i++)
        System.err.println("A");
    }
}
class B{
    void print(){
    for(int i=0;i<10;i++)
    System.out.println("B");
    }
}

public class Threadsinjava {
   public static void main(String[] args) {
    
    A obj1 = new A();
    B obj2 = new B();
    obj1.print();
    obj2.print();
   } 
    
}
