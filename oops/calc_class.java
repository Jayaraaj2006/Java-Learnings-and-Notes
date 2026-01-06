package Assignments.oops;

public class calc_class {
    static class add {
        int a;
        int b;
    }
    class sub{
        int a;
        int b;
    }
    class mul{
        int a;
        int b;
    }

    public static void main(String[] args) {
        add obj1 = new add();
        obj1.a = 1;
        obj1.b = 2;

        System.out.println(obj1.a);
    }
}
