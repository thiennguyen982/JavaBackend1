package JavaCore;
import java.util.Scanner;

public class Lec07Prac01 {
    
    static class Book{
        String title;
        String author;
        int releasedYear;

        Book(String title, String author, int releasedYear){
            this.title = title;
            this.author = author;
            this.releasedYear = releasedYear;
        }

        void getInfo(){
            System.out.printf("Title: %s\n", this.title);
            System.out.printf("Author: %s\n", this.author);
            System.out.printf("Released Year: %d\n", this.releasedYear);
        }

        boolean isReleasedBefore(int refYear){
            if (this.releasedYear > refYear) {
                return false;
            }
            return true; 
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        // Book book1 = new Lec07Prac01.Book("The C Programming Language", "Someone", 1990);
        // Book book2 = new Lec07Prac01.Book("The Art of Programming", "Someone else", 1980);
        // Book book3 = new Lec07Prac01.Book("Algorithm", "Someone else", 1887);

        // book1.getInfo();
        
        // System.out.println("Enter reference year to check: ");
        // int refYear = scanner.nextInt();

        // System.out.printf("The book %s is released before %d - %b\n", book1.title, refYear, book1.isReleasedBefore(refYear));

        //Viết chương trình nhập vào mảng N cuốn sách với class book
        System.out.println("Input number of books in array: ");
        int N = scanner.nextInt();
        Book[] books = new Book[N];

        for (int i = 0; i < books.length; i++) {
            System.out.printf("Input the title of book number %d ", i+1);
            String title = scanner.next();
            System.out.printf("Input the author for the book %d ", i+1);
            String author = scanner.next();
            System.out.printf("Input the released year for the book %d ", i+1);
            int releasedYear = scanner.nextInt();

            books[i] = new Book(title, author, releasedYear);
        }

        scanner.close();

        for (int i = 0; i < books.length; i++) {
            System.out.printf("\nThe details of the book number %d", null, i+1);
            books[i].getInfo();
        }
    }
}
