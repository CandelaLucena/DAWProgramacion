/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber = "";
    private int borrowed;
    private final boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, int bookBorrowed, boolean bookCourseText){
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        borrowed = bookBorrowed;
        courseText = bookCourseText;
    }

    // Add the methods here ...

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public int getPages(){
        return pages;
    }
    public String getRefNumber(){
        return refNumber;
    }
    public int getBorrowed(){
        return borrowed;
    }
    public boolean ifCourseText(){
        return courseText;
    }

    public void setRefNumber(String ref){
        if((ref.length()) > 3){
            refNumber = ref;
        }else{
            System.out.println("Error, no se modificó el campo.");
        }
    }

    public void borrow(){
        borrowed++;
    }

    public void printAuthor(){
        System.out.println(author);
    }

    public void printTitle(){
        System.out.println(title);
    }

    public void prinDetail(){
        System.out.println("Autor: "+author+
                            "Titulo: "+title+
                            "Numero de paginas: "+pages+
                            "Referencia: "+refNumber+
                            "Numero de veces prestado: "+borrowed+
                            "Texto de curso: "+courseText);
    }
}
