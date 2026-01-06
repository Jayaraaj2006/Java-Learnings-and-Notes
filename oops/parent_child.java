package Assignments.oops;

import javax.swing.*;

public class parent_child {
    public static void main(String[] args) {
        BoxPrice obj = new BoxPrice();
        System.out.println(obj.weight);


    }
}
class Box {
    int weight ;
    Box(int weight){
         this.weight = weight;
    }
    Box(){
        this.weight = 1;
    }

}
class BoxWeight extends Box {

    int l;
    int b;
    int h;
    int side;

    BoxWeight(int l,int b,int h,int weight) {
        super();
        this.l = l;
        this.b = b;
        this.h = h;
    }
    BoxWeight(int side) {
        super();
        this.side = side;
    }
    BoxWeight(){
        super();
    }


}
class BoxPrice extends BoxWeight {
    BoxPrice(){
        super();
    }

}
