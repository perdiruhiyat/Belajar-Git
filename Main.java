package PBO1.LatihanOOP;

public class Main {
    public static void main(String[] args) {
        Library library1 = new Library("Perpustakaan Perdi");
        Library library2 = new Library("Perpustakaan Ruhiyat");

        library1.addBook(new Book("Dilan : Dia adalah Dilanku 1990", "Pidi Baiq"));
        library1.addBook(new Book("Tentang Kamu", "Tere Liye"));

        library2.addBook(new Book("Harry Potter and The Sorcerers Stone", "J. K Rowling"));
        library2.addBook(new Book("Harry Potter and The Prisoner of Azkaban", "J. K Rowling"));

        Visitor visitor1 = new Visitor("Ruhiyat");
        Member member1 = new Member("Perdi");

        visitor1.viewBooks(library2);
        visitor1.borrowBook(library1, "Dilan : Dia adalah Dilanku 1990");

        member1.borrowBook(library1, "Dilan : Dia adalah Dilanku 1990");
        member1.returnBook(library1, "Dilan : Dia adalah Dilanku 1990");
    }
}
