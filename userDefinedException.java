class MyException extends Exception {
    public MyException(String message) {
        super(message);
}
}
class userDefinedException {

    

    public static void main(String args[]){
        int a = 20;
        int b = 0;
        int c=0;
        try{
          
           if(b==0){
            throw new MyException("this is exception created by bhavesh devide by zero");
        }
        c = a/b;
    }
        catch (MyException e){
            System.out.println("error occured ;"+e.getMessage());

        }  
        System.out.println(c);


    }
    
}
