package Assignments.oops;

public class Copy_const {
    public static void main(String[] args) {
        A obj1 = new A(16,"jayaraaj");
        A obj2 = new A(obj1);

        obj2.id = 12;
        obj2.name = "raj";

       obj1.display();
       obj2.display();

    }

}
class A{
    int id;
    String name;

    public A(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public A(A copy) {
        this.id = copy.id;
        this.name = copy.name;
    }
    public void display(){
        System.out.println(id + " " + name);
    }
}
