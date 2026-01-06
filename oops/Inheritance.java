package Assignments.oops;

public class Inheritance {
    public static void main(String[] args) {

//        child child = new child();
//        child.l = 2;
//        child.h = 3;
//        child.b = 4;
//        child.w = 5;
//
//        System.out.println(child.l + " "+child.h+" "+child.b+" "+child.w );
        child obj = new child();
        System.out.println(obj.w);
        child obj1 = new child();
        System.out.println(obj1.l);
        child obj2 = new child(1,2,3,4);
        System.out.println(obj2.l + " " + obj2.b + " " + obj2.h + " " + obj2.w);//constructor overloading.

    }

}
class Parent{
    int l;
    int h;
    int b;
    Parent(int l,int h,int b){
        this.l = l;
        this.h = h;
        this.b = b;
    }
    Parent(int l){
        this.l = l;
    }
    Parent(){
        this.l = -1;
        this.h = -1;
        this.b = -1;
    }
}
class child extends Parent {
    int w;
    child(){
        this.w = -1;
    }
    child(int l){
        super(l);
    }
    child(int l,int b,int h,int w){
        super(l,h,b);
        this.w = w;
    }


}




