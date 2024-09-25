
class StaticVar{
static class Student{

    static int count;

    String name;
    int age;
    int roll;


    void show(){
        System.out.println("name: "+this.name+" age: "+this.age+" roll: "+this.roll);
    }
}


public static void main(String args[]){
    Student s1 = new Student();
    s1.name  = "bhavesh";
    s1.age = 20;
    s1.roll = (Student.count+=1);

    Student s2 = new Student();
    s2.name =  "Abhi";
    s2.age = 21;
    s2.roll = (Student.count+=1);


    s1.show();
    s2.show();

}

}