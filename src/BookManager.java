public class BookManager {
    int MAX_SIZE=100;
    Book[] books = new Book[MAX_SIZE];
    int size=0;

    void AddBook(String title, String no, String author, String genre){
        Book book = new Book();
        book.setTitle(title);
        book.setNo(no);
        book.setAuthor(author);
        book.setGenre(genre);

        books[size++]=book;
    }

    void RemoveBook(String title){
        System.out.println("-----삭제되었습니다.-----");
        for(int i=0; i<size; i++){
            if(books[i].getTitle().equals(title)){
                for(;i<size;i++){
                    books[i]=books[i+1];
                }
                size--;
            }
        }
    }


}
