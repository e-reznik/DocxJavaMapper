package docxjavamapper;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Helper {

    private static final String DOCUMENT_XML_PATH = "word/document.xml";

    private Helper() {
    }

    /**
     * Returns the stream to a document.xml from the DOCX-archive.
     *
     * @param docx the Docx file
     * @return the InputStream of the document.xml
     * @throws IOException if the file cannot be read or document.xml is not found
     */
    public static InputStream getDocument(File docx) throws IOException {
        return getZipEntry(docx, DOCUMENT_XML_PATH);
    }

    private static InputStream getZipEntry(File docx, String entryPath) throws IOException {
        try (ZipFile zipFile = new ZipFile(docx)) {
            ZipEntry entry = zipFile.getEntry(entryPath);
            if (entry == null) {
                throw new IOException("Entry not found in DOCX: " + entryPath);
            }
            return new ByteArrayInputStream(zipFile.getInputStream(entry).readAllBytes());
        }
    }

}
