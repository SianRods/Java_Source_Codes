
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    
    public int getPublicationYear() {
        return publicationYear;
    }

    // CREATING AN COMPARISON METHOD 

    public boolean equals(Book bk){
        if(this.getName().equals(bk.getName())&& this.getPublicationYear()==bk.getPublicationYear()){
            return true;
        }
        else{
            return false ;
        }
    }

}
