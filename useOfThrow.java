class useOfThrow {
    public static void main(String args[]){
        try {
            int a = 10;
            int b = 0;
            if(b==0){
                throw new ArithmeticException("Cannot divide by zero");
            }
            int c = a/b;
            System.out.println("Result is: "+c);
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e);
        }
    }
    
}
