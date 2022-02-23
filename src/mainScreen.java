import java.util.Scanner;

import static java.lang.System.exit;

public class mainScreen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BookManager bookmanager = new BookManager();
        UserManager usermanager = new UserManager();

        while(true){
            System.out.println("========================");
            System.out.println("도서관리 프로그램");
            System.out.println("========================");
            System.out.println("1. 회원등록 \n2. 회원삭제 \n3. 도서등록 \n4. 도서삭제 \n5.나가기");
            char num = sc.next().charAt(0);
            switch (num) {
                case 1 -> {System.out.println("등록할 회원님의 이름을 입력하세요 : ");
                    String name = sc.nextLine();
                    System.out.println("회원님의 생년월일(6자리)을 입력하세요 : ");
                    String birthday = sc.nextLine();
                    usermanager.AddUser(name,birthday);}

                case 2 -> {System.out.println("삭제할 회원님의 이름을 입력하세요");
                    String name = sc.nextLine();
                    usermanager.RemoveUser(name);}

                case 3 -> {System.out.println("등록할 도서의 제목을 입력하세요");
                    String title = sc.nextLine();
                    System.out.println("도서의 넘버(6자리)를 입력하세요");
                    String no = sc.nextLine();
                    System.out.println("도서의 작가를 입력하세요");
                    String author = sc.nextLine();
                    System.out.println("도서의 장르를 입력하세요");
                    String genre = sc.nextLine();
                    bookmanager.AddBook(title, no,author,genre);}
                case 4 -> {System.out.println("삭제할 도서의 제목을 입력하세요");
                    String title = sc.nextLine();
                    bookmanager.RemoveBook(title);}
                case 5 -> System.exit(0);
                // case 5 -> System.out.println("도서대여창");
                //case 6 -> System.out.println("도서반납창");
            }
        }
    }
}
