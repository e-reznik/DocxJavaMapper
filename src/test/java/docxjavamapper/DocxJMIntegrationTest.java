package docxjavamapper;

import docxjavamapper.model.DJMDocument;
import docxjavamapper.model.DJMParagraph;
import docxjavamapper.model.DJMRun;
import docxjavamapper.model.interfaces.BodyElement;
import docxjavamapper.model.interfaces.ParagraphElement;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class DocxJMIntegrationTest {

    @Test
    void parsesSimpleDocx() throws Exception {
        Path docx = Path.of(
                Objects.requireNonNull(getClass().getResource("/example.docx")).toURI()
        );

        DJMDocument document = DocxJM.map(docx.toString());

        assertNotNull(document);
        assertNotNull(document.getBody());
        assertFalse(document.getBody().getBodyElements().isEmpty());

        // Verify we can access paragraphs
        List<BodyElement> bodyElements = document.getBody().getBodyElements();
        BodyElement firstElement = bodyElements.get(0);
        assertInstanceOf(DJMParagraph.class, firstElement);

        // Verify we can access runs and text content
        DJMParagraph paragraph = (DJMParagraph) firstElement;
        assertNotNull(paragraph.getParagraphElements());
        assertFalse(paragraph.getParagraphElements().isEmpty());

        // Extract text from the first paragraph
        String text = extractText(paragraph);
        assertNotNull(text);
        assertFalse(text.isBlank(), "First paragraph should contain text");
    }

    private String extractText(DJMParagraph paragraph) {
        StringBuilder sb = new StringBuilder();
        for (ParagraphElement element : paragraph.getParagraphElements()) {
            if (element instanceof DJMRun run && run.getText() != null) {
                sb.append(run.getText());
            }
        }
        return sb.toString();
    }

}