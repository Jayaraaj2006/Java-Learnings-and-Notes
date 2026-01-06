package Assignments.oops;

public class get_set {
    public static void main(String[] args) {
        main a = new main();
        System.out.println(a.getName());
        a.setName("jaya");
        System.out.println(a.getName());
    }
}
class main{
    private String name = "raj";

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
