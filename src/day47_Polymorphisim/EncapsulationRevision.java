package day47_Polymorphisim;

public class EncapsulationRevision {
    private String bookTitle;
    private final String publishedDAte;
    // if the private data are final , we won't be able to generate setters (no way we can reassign the variables)


    public EncapsulationRevision(String bookTitle, String publishedDAte) {
        this.bookTitle = bookTitle;
        this.publishedDAte = publishedDAte;
    }

    public String getBookTitle() {
        if(bookTitle==null)
        return "";
        return null;
    }

    public void setBookTitle(String bookTitle) {
        if(bookTitle == null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishedDAte() {
        return publishedDAte;
    }
}
