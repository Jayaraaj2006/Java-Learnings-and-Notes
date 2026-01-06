package Assignments.oops;

abstract class parent{
    int age;

    public parent(int age) {
        this.age = age;
    }

    abstract void career();
    abstract void partner();
}
class son extends parent{
    public son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("i'll be a developer");
    }
    void partner(){
        System.out.println("I love pooja hegde");
    }
}
class daughter extends parent{
    public daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("i'll be a entrepreneur");
    }
    void partner(){
        System.out.println("I love jayaraaj");
    }
}
public class Abst_class {
    public static void main(String[] args) {
        son son = new son(12);
        parent daughter = new daughter(18);


        System.out.println(daughter.age);
        daughter.career();


    }
}
