package PBO1.LatihanOOP;

public class Member extends Visitor {
    
    public Member(String memberName) {
        super(memberName);
    }

    @Override
    public void borrowBook(Library library, String title) {
        Book book = library.findBook(title);
        if (book != null && book.isAvailable()) {
            book.borrow();
            System.out.println(getVisitorName() + " berhasil meminjam buku \"" + title + "\" dari " + library.getLibraryName() + ".");
        } else {
            System.out.println("Buku \"" + title + "\" tidak tersedia untuk dipinjam.");
        }
    }

    public void returnBook(Library library, String title) {
        for (Book book : library.getBooks()) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.returnBook();
                System.out.println(getVisitorName() + " berhasil mengembalikan buku \"" + title + "\" ke " + library.getLibraryName() + ".");
                return;
            }
        }
        System.out.println("Buku \"" + title + "\" tidak ditemukan atau tidak sedang dipinjam.");
    }
}
