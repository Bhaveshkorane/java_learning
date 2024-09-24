
class Fun{
    int a,b;
    Fun(int a,int b){
        this.a = a;
        this.b = b;

    }
    public int add()
    {
        return this.a+this.b;
    }
}

public class methodsInJava {
    public static void main(String[] args)
    {
        Fun f = new Fun(5,6);
        System.out.println(f.add());
        
    }
    
}
