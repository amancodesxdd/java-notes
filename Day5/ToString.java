public class ToString {
    public static void main(String[] args) {
        Car6 c1 = new Car6("Mustang",1);
        System.out.println(c1);

        book1 b1 = new book1("Don't Let Her Stay","Nichola Abilio Po","ABC123");

        ebook e1 = new ebook("Oddesey", "Circe", "DFG456", 200);

        System.out.println("BOOK 1: "+ b1.gettitle());
        System.out.println("BOOK1 author: "+ b1.getauthor());

        
        b1.settitle("Crime and No Punishment");
        b1.setauthor("Fyodor Dostoevsky");
        System.out.println("Book1: "+ b1);

        
        
        
}
}
class Car6 {
    String name;
    int number;

    Car6(String name,int number){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString(){
        return "Car{name='"+this.name+"',Number="+this.number+"}";
    }
}


class book1{
    String title;
    String author;
    String isbn;

    book1(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn; 
    }

    public String gettitle(){return title;}
    public String getauthor(){return author;}
    public String getisbn(){return isbn;}

    public void settitle(String title){this.title = title;}
    public void setauthor(String author){this.author = author;}
    public void setisbn(String isbn){this.isbn = isbn;}

    @Override
    public String toString(){
        return "Book: [Title: "+title+ "Author: "+ author+ "ISBN: "+ isbn+"}";
    }


}

class ebook extends book1{
    double filesize;

    ebook(String title,String author,String isbn,double filesize){
        super(title,author,isbn);
        this.filesize = filesize;
    }
    public double getfilesize(){return filesize;}
    public void setfilesize(double filesize){
        this.filesize = filesize;
    }

    @Override
    public String toString(){
        return "Book: [Title: "+title+ "Author: "+ author+ "ISBN: "+ isbn+"filesizeinMB: "+ filesize ;
    }

}





