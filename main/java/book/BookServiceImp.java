package book;

import java.util.Scanner;

public class BookServiceImp implements BookServices{

    private static final int MAX_BOOKS = 15;

    public static Book[] bookList = new Book[MAX_BOOKS];

    public static int numberOfBook = 0;

    @Override
    public void addBook(Scanner scan) {
        if(numberOfBook >= MAX_BOOKS) {
            System.out.println("Sorry, The Book Store is full we can't add more. ");
            return;
        }
        scan.nextLine();
        System.out.println("Enter Book Name");
        String bookName = scan.nextLine();
       // scan.next();
        System.out.println("Enter Book Author");
        String bookAuthor = scan.nextLine();
       // scan.next();

        System.out.println("Enter Book Price");
        double bookPrice = scan.nextDouble();
       // scan.nextLine();

        System.out.println("Enter Book Page");
        int bookPage = scan.nextInt();
       // scan.nextLine();

        Book book = new Book(bookName,bookAuthor,bookPrice,bookPage);

        bookList[numberOfBook ++] = book;
        System.out.println("Book Added to library Successfully");

    }

    @Override
    public void updateBook(Scanner scan) {
        if(numberOfBook == 0) {
            System.out.println("There is No book at the library");
            return;
        }
        System.out.println("Enter the Index of book to update ( 0 to " + (numberOfBook - 1) + "):");
        int index = scan.nextInt();
      //  scan.nextLine();

        if(index >= 0 && index < numberOfBook){
            scan.nextLine();
            System.out.println("Enter New book Name");
            String newBookName = scan.nextLine();

            System.out.println("Enter New book Author");
            String newBookAuthor = scan.nextLine();

            System.out.println("Enter New book price");
            double newBookPrice = scan.nextDouble();

            System.out.println("Enter New book page");
            int newBookPage = scan.nextInt();

            Book updateBook = new Book(newBookName,newBookAuthor,newBookPrice,newBookPage);
            bookList[index] = updateBook;

            System.out.println("Book Updated to the library Successfully");
        } else {
            System.out.println("Invalid index , No book updated");
        }

    }

    @Override
    public void readBook() {
        if(numberOfBook == 0) {
            System.out.println("No Book Found");
            return;
        }
        System.out.println(" ---------------- List of Books ----------");
        for (int i = 0; i < numberOfBook; i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(bookList[i]);
        }
        System.out.println("------------------");

    }


    @Override
    public void reserveBook(Scanner scan) {
        if(numberOfBook == 0) {
            System.out.println(" There is No Book to reserve ");
        }
        System.out.println("Enter the index of the student to remove (0 to) + " + (numberOfBook - 1) + ")");
        int index = scan.nextInt();
        if(index >= 0 && index < numberOfBook) {
            for (int i = index; i < numberOfBook - 1; i++) {
                bookList[i] = bookList[i + 1];
            }
            bookList[numberOfBook - 1] = null;
            numberOfBook --;
            System.out.println("Book reserved successfully");
        } else {
            System.out.println("Invalid index, no Book reserve");
        }

    }
}
