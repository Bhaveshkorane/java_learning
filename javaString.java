import java.util.Scanner;
public class javaString {
    public static void main(String args[]){

        // stirng initialization using string literal 
        String str1 = "Bhavesh";


        // string initialization using new keyword 
        String str2 = new String("Bhavesh");

        System.out.println("string created using stirng literal:"+str1);
        System.out.println("string created using new keyword:"+str2);

        System.out.println("memory location of "+str1+" before concatination "+System.identityHashCode(str1));
        str1 +=" hello";
        System.out.println("memory location of "+str1+" after concatination "+System.identityHashCode(str1));


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();


        //this will print the class of variable 
        System.out.println("Class of name variable:"+name.getClass());

        //this will print the simple name of datatype
        System.out.println("Type of name variable:"+name.getClass().getSimpleName());
        System.out.println(System.identityHashCode(name));

        //Using to upper and to lower 
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        sc.close();

    }
    
}


class stringBuffer{
    public static void main(String args[]){

        //string buffer always has extara buffer space at starting it has min 16 unit buffer space 
        StringBuffer sb = new StringBuffer("Bhavesh");
        System.out.println("original string buffer:"+sb);

        System.out.println("Memory location before  append operation: "+sb+" :"+System.identityHashCode(sb));

        // sb += " Korane";

        System.out.println("the capacity of string buffer is:"+sb.capacity());
        System.out.println("The size of string buffer is :"+sb.length());

        sb.append(" Korane");
        System.out.println("Memory location after append operation: "+sb+" :"+System.identityHashCode(sb));



    }
}



