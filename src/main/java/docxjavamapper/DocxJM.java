package docxjavamapper;

import docxjavamapper.model.DJMDocument;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class DocxJM {

    private static final JAXBContext JAXB_CONTEXT;

    static {
        try {
            JAXB_CONTEXT = JAXBContext.newInstance(DJMDocument.class);
        } catch (JAXBException e) {
            throw new ExceptionInInitializerError("Failed to initialize JAXB context: " + e.getMessage());
        }
    }

    private DocxJM() {
    }

    /**
     * Maps a given Docx to a Pojo and returns it.
     *
     * @param is InputStream containing DOCX document XML
     * @return the mapped Pojo
     * @throws DocxJMException if parsing fails
     */
    public static DJMDocument map(InputStream is) throws DocxJMException {
        if (is == null) {
            throw new DocxJMException("InputStream cannot be null");
        }

        try {
            Unmarshaller unmarshaller = JAXB_CONTEXT.createUnmarshaller();
            return (DJMDocument) unmarshaller.unmarshal(is);
        } catch (JAXBException e) {
            throw new DocxJMException("Failed to parse DOCX document", e);
        }
    }

    /**
     * Maps a given Docx file to a Pojo and returns it.
     *
     * @param file the Docx file
     * @return the mapped Pojo
     * @throws DocxJMException if file cannot be read or parsing fails
     */
    public static DJMDocument map(File file) throws DocxJMException {
        if (file == null) {
            throw new DocxJMException("File cannot be null");
        }
        if (!file.exists()) {
            throw new DocxJMException("File does not exist: " + file.getAbsolutePath());
        }
        if (!file.canRead()) {
            throw new DocxJMException("File cannot be read: " + file.getAbsolutePath());
        }

        try (InputStream is = Helper.getDocument(file)) {
            return map(is);
        } catch (IOException e) {
            throw new DocxJMException("Failed to read DOCX file: " + file.getAbsolutePath(), e);
        }
    }

    /**
     * Maps a given Docx to a Pojo and returns it.
     *
     * @param path path to the Docx file
     * @return the mapped Pojo
     * @throws DocxJMException if file cannot be read or parsing fails
     */
    public static DJMDocument map(String path) throws DocxJMException {
        if (path == null || path.isBlank()) {
            throw new DocxJMException("File path cannot be null or empty");
        }
        return map(new File(path));
    }

}
