package docxjavamapper.model;

import docxjavamapper.model.interfaces.BodyElement;
import docxjavamapper.model.interfaces.ParagraphElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import java.util.List;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

/**
 * p (Paragraph)
 *
 * This element specifies a paragraph of content in the document.
 *
 * The contents of a paragraph in a WordprocessingML document shall consist of
 * any combination of the following four kinds of content:
 *
 * Paragraph properties
 *
 * Annotations (bookmarks, comments, revisions)
 *
 * Custom markup
 *
 * Run level content (fields, hyperlinks, runs)
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DJMParagraph implements BodyElement{

    List<ParagraphElement> paragraphElements;

    @XmlElements({
        @XmlElement(name = "pPr", type = DJMParagraphProperties.class),
        @XmlElement(name = "r", type = DJMRun.class),
        @XmlElement(name = "hyperlink", type = DJMHyperlink.class)
    })

    public List<ParagraphElement> getParagraphElements() {
        return paragraphElements;
    }

    private void setParagraphElements(List<ParagraphElement> paragraphElements) {
        this.paragraphElements = paragraphElements;
    }

}
