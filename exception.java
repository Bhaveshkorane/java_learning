public class exception {
    public static void main(String[] args) {

        int a = 10;
        // int b = 0; //to get  ArithmeticException
        int b=1;
        int c = 0;

        int [] nums = new int[5];
        try{

            c = a/b;
            System.out.println("element at index 5 is:"+nums[5]);
        }
        catch(ArithmeticException e){//this will catch arithematic  exception
            System.out.println("Arithmetic Exception Occured can't devide by zero ");
            }
        catch(ArrayIndexOutOfBoundsException e) //this will catch array out of bound exception 
        {
            System.out.println(" trying to access index out of array range ");
        }
        catch(Exception e)//this will  catch all the exceptions
        {
            System.out.println("something went wrong "+e);
        }

        System.out.println("Value of c = "+c);

        
    }
    
}
