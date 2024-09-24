import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer>nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        // for(Integer i:nums)
        // {
        //     System.out.print(i+" ");
        // }
        // System.out.println();

        // for(int i=0;i<nums.size();i++)
        // {
        //     System.out.print(nums.get(i)+" ");
        // }

        List<String> names  = new ArrayList<String>();

        //adding elements 
        names.add("Bhavesh");
        names.add("Rajesh");
        names.add("Kirtikumanr");
        names.add("sai");
        names.add("Bhavesh");
        names.add("Bhavesh");

        System.out.println("before updating:"+names);
        //updating elements set()
        names.set(2,"kirti");
        System.out.println("after Updating:"+names);

        //searcing for elements 
        System.out.println("The first occurence of Bhavesh is:"+names.indexOf("Bhavesh"));
        System.out.println("The last occurence of Bhavesh is:"+names.lastIndexOf("Bhavesh"));

        //removing element
        System.out.println("Before removing element:"+names);
        names.remove("Bhavesh");
        names.remove(4);
        System.out.println("After removing element:"+names);




        
    }
    
}
