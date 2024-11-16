package PBO1.LatihanOOP;

public class Visitor {
    private String visitorName;

    public Visitor(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void viewBooks(Library library) {
        System.out.println(visitorName + " melihat daftar buku di " + library.getLibraryName() + ":");
        library.viewBooks();
    }
    

    public void borrowBook(Library library, String title) {
        System.out.println("Maaf, " + visitorName + " bukan anggota dan tidak dapat meminjam buku.");
    }
}
