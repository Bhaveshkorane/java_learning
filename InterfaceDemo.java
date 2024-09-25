
interface A{
    void show();
    void show1();
}

class B implements A{
    public void show(){
        System.out.println("in show of B");
    }

    public void show1(){
        System.out.println("in show1 ob B");
    }
}

public class InterfaceDemo {
    public static void main(String args[])
    {
        
        B obj = new B();
        obj.show();
        obj.show1();

    }
}
