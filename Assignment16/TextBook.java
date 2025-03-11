package dinhthithutrang_3797;

import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book {

    private String status;

    public TextBook() {
    }

    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        super.addBook();
        System.out.println("Enter Status: ");
        setStatus(scanner.nextLine());
        System.out.println("TextBook added sucessfully.");

    }

    public void updateBook(String id) {
        if (getBookId().equals(id)) {
            Scanner scanner = new Scanner(System.in);
            super.updateBook(id);
            System.out.println("Enter New Status: ");
            setStatus(scanner.nextLine());
            System.out.println("TextBook update sucessfully.");
        } else {
            System.out.println("TextBook with ID " + id + " not found");
        }
    }

    public void displayBook() {
        super.displayBook();
        System.out.println("Status: " + getStatus());
    }

}
