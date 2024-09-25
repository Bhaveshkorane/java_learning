public class FinalKeyWord {

    public static class Student{
        final String school = "DVN";//this variable cant be modified
        final public void display(){//this method cant be overridden
            System.out.println(school);
        }

    }

    final public class Person{//this call cant be inherited 
        final String name = "John";
        public void show(){
            System.out.println(name);
        }

    }
    public static void main(String args[])
    {
        Student s = new Student();
        s.display();


    }
    
}
