package PBO1.LatihanOOP;

import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void viewBooks() {
        System.out.println("Daftar Buku di " + libraryName + ":");
        if (books.isEmpty()) {
            System.out.println("Tidak ada buku di perpustakaan ini.");
        } else {
            for (Book book : books) {
                System.out.println("- " + book.getTitle() + " oleh " + book.getAuthor() +
                                   (book.isAvailable() ? " (Tersedia)" : " (Dipinjam)"));
            }
        }
        System.out.println();
    }
}
