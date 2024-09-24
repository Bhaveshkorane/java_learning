public class array {
    public static void main(String args[])
    {
        int num[] = new int[4];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;

        System.out.print("The array is :");
        
        for(int i=0;i<4;i++)
        {
            System.out.print(i+" ");
        }

        System.out.print("\nThe num1 arrays is:");

        int num1[] = {1,2,3,4,5,6,7,8};
        for(int i=0;i<8;i++)
        {
            System.out.print(num1[i]+" ");
        }
    }
    
}

class multiDArray{
    public static void main(String args[])
    {
        int num[][] = new int[2][2];
        num[0][0] = 10;
        num[0][1] = 20;
        num[1][0] = 30;
        num[1][1] = 40;

        System.out.println("the multidimensional array is:");

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)

            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class jaggedArray{
    public static void main(String args[])
    {
        int num[][] = new int[3][];
        num[0] = new int[3];
        num[1] = new int[4];
        num[2] = new int[2];
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                    num[i][j] = (int)(Math.random()*10);
            }
        }


        for(int n[]:num)
        {
            for(int m:n)
            {
                System.out.print(m+" ");
            }

            System.out.println();

        }

    }
}
