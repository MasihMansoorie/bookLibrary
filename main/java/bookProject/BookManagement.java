package book;

import java.util.Scanner;

public class BookManagement  {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BookServiceImp bookLibrary = new BookServiceImp();

        int option;
        do {
            System.out.println("----------- Welcome to the Library App ----------");
            System.out.println("1 - Add Book");
            System.out.println("2 - Update Book");
            System.out.println("3 - Reserve Book");
            System.out.println("4 - Display all Book");
            System.out.println("5 - Exit");

            System.out.println("Enter your Option");

            option = scanner.nextInt();

            switch(option) {
                case 1:
                    bookLibrary.addBook(scanner);
                    break;
                case 2:
                    bookLibrary.updateBook(scanner);
                    break;
                case 3:
                    bookLibrary.reserveBook(scanner);
                    break;
                case 4:
                    bookLibrary.readBook();
                    break;
                case 5:
                    System.out.println("Exit the program , Thank You !");
                default:
                    System.out.println("Invalid Option");

            }
        } while (option != 5);

        scanner.close();
    }
}
