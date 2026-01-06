package Assignments.oops;

public class Singleton_class {

    private static Singleton_class obj = new Singleton_class();

    private Singleton_class(){

    }

    public static Singleton_class getInstance(){
        return obj;
    }

}
class demo {
    public static void main(String[] args) {
        Singleton_class obj1 = Singleton_class.getInstance();
        Singleton_class obj2 = Singleton_class.getInstance();

        System.out.println(obj1 == obj2);

    }
}





