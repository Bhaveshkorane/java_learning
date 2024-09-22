import java.util.Scanner;
class ifDemo{
    public static void main(String[] args) {
        int n=10;
        for(int i=0;;i++)
        {
            if(i<=n)
            System.out.println("i is less than 10");
            else{
            System.out.println("i is greater than 10");
            break;
            }

        }
    }
}

class caseDemo{
    public static void main(String[] args) {
        int rank;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your randk from 1 to 3:");
        rank=sc.nextInt();
        switch(rank){
            case 1:
            System.out.println("You are in first position and you will receive 100 points ");
            break;
            case 2:
            System.out.println("You are in second position and you will receive 80 points ");
            break;
            case 3:
            System.out.println("You are in third position and you will receive 60 points ");
            break;
            default:
            System.out.println("You are not in top three");
        }

        sc.close();
    }

}