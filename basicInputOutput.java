import java.util.Scanner;
class first{
    public static void main(String[] args) {
        System.out.println("hello bhavesh how are you doing");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("hello "+name);

        sc.close();
    }
}
