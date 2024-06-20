public class Book{
    private String name ;
    private String pages;
    private int publicationYear ;

    // Creating Constructor to Intialise the Instance Variables 
    public Book(String bookName, String noPages, int publicationYear){
        this.name =bookName;
        this.pages =noPages;
        this.publicationYear=publicationYear;
    }

    // Creating a Method to Retrun the name of the book

    public String name(){
        return name ;
    }

    // Overiding the to String Method to Print in case of Everyhting 
    public String toString(){
        return name+","+pages+"pages,"+publicationYear;
    }
}