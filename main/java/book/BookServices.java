package book;

import java.util.Scanner;

public interface BookServices {

    void addBook(Scanner scan);
    void updateBook(Scanner scan);
    void readBook();
    void reserveBook(Scanner scan);

}
