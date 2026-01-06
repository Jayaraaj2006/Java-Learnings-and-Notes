package Assignments.simple_java_programs;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,8,0,4,2,6};
        int target = 1;
        SqSearch(a,target);
    }
    public static void SqSearch(int[]a,int b){
        int index = -1;
        for(int i =0 ; i<a.length ; i++){
            if(a[i] == b){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("there's no element in the array.");
        }
        else{
            System.out.println("The targeted element in index no " + index);
        }
    }
}
