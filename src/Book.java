
import java.util.Scanner;

public class Book {
    Scanner sc = new Scanner(System.in);
    //필드
    private String title;
    private String no;
    private String author;
    private String genre;
    Boolean lend;

    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setNo(String no){
        this.no=no;
    }
    public String getNo(){
        return no;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void setGenre(String genre){
        this.genre=genre;
    }
    public String getGenre(){
        return genre;
    }

}
