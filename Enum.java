

enum Status{
    Running,Started,Pending,Terminated
}

public class Enum {
    public static void main(String args[])
    {
        Status s = Status.Running;
        System.out.println(s);

        Status arr[] = Status.values();

        System.out.println("Printing form the values status[] :");
        for(Status i:arr)
        {
            System.out.println(i);
        }

    }

}
