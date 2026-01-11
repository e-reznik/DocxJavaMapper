package docxjavamapper;

/**
 * Exception thrown when an error occurs during DOCX parsing or mapping.
 */
public class DocxJMException extends Exception {

    public DocxJMException(String message) {
        super(message);
    }

    public DocxJMException(String message, Throwable cause) {
        super(message, cause);
    }

}