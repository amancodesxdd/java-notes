public class Composition {
    public static void main(String[] args) {
        book3 b1 = new book3("XYZ","ROSE");
        b1.displaybook();
    }
    
    
}
class page{
    String content;

    public page(String content){
        this.content = content;
    }

    public void display(){
        System.out.println(content);
    }
    
}

class book3{
    String title;
    String author;
    page page1;
    page page2;
    page page3;

    public book3(String title,String author){
        this.title = title;
        this.author = author;
        this.page1 = new page("hellooooo");
        this.page2 = new page("Hieeeeeee");
        this.page3 = new page("Bieeeeeee");
    }
    public void displaybook(){
        System.out.println(title);
        System.out.println(author);
        page1.display();
        page2.display();
        page3.display();
    }

}
