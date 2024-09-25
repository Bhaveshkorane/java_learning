
abstract class Person{
    abstract void walk();
    abstract void speak();
}

class Student extends Person{
    void walk(){
        System.out.println("Student is walking");
    }
    void speak(){
        System.out.println("Student is speaking");
    }
}


public class AbstractImplement {

    public static void main(String args[])
    {

        Student s1 = new Student();
        s1.walk();
        s1.speak();

    }
    
}
