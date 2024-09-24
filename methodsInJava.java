/*Methods implemented
 * 1.Instance method
 * 2.Static methods 
 * 3.Abstract mehtods 
 * 
 */



class Fun{
    int a,b;
    Fun(int a,int b){
        this.a = a;
        this.b = b;

    }
    public int add() //This is instance method 
    {
        return this.a+this.b;
    }

}

abstract class multiply{
    abstract void mul();

}


public class methodsInJava extends multiply{

    void mul()
    {
        System.out.println("the multiplication method is being called which is abstract");
    }

    static void display(){//static method 
        System.out.println("This is static mehtod and calling it in main ");
    }
    void hello(){//instance method
        System.out.println("This is instance method and calling it in main ");
    }
    public static void main(String[] args)
    {
        Fun f = new Fun(5,6);
        System.out.println("The addition of numbers is:"+f.add());
        display();

        //object creation to call  instance method and abstrac method 
        methodsInJava obj = new methodsInJava();
        obj.hello();
        obj.mul();
        
    }
    
}
