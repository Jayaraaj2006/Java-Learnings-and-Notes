package Assignments.copy_clone_obj;

// ShallowCopy & DeepCopy.

public class ShallowDeep_Copy {
    public static void main(String[] args) {
        Page p1 = new Page(1);
        Book b1 = new Book("Java Basics",p1);



//        Book b2 = new Book(b1.title,b1.page);// ShallowCopy(pointing to the same object or reference)
        Book b2 = new Book(b1.title,new Page(1)); // Deep Copy(two different objects,not gonna modify)

        b2.page.number = 4;

        System.out.println("the page number in b1 = " + b1.page.number);
        System.out.println("the page number in b2 = " + b2.page.number);


    }

}
class Page{
    int number;
    Page(int number){
        this.number = number;
    }
}
class Book{
    String title;
    Page page; // Type of Page.
    Book(String title,Page page){
        this.title = title;
        this.page = page;
    }
}
