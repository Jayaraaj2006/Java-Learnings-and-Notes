package Assignments.oops.Interface.Default_methods;

public class Main implements A,B{
    @Override
    public void B() {
        System.out.println("I,m in Main");
    }

//    @Override
//    public void A() {
//        A.super.A();
//    }

    public static void main(String[] args) {
        Main obj = new Main();

        obj.A();
        obj.B();
    }
}
