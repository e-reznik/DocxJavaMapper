package docxjavamapper.model;

import docxjavamapper.model.interfaces.iBodyElement;
import docxjavamapper.model.interfaces.iParagraphElement;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
public class DJMParagraph implements iBodyElement{

    List<iParagraphElement> paragraphElements;

    @XmlElements({
        @XmlElement(name = "pPr", type = DJMParagraphProperties.class),
        @XmlElement(name = "r", type = DJMRun.class),
        @XmlElement(name = "hyperlink", type = DJMHyperlink.class)
    })

    public List<iParagraphElement> getParagraphElements() {
        return paragraphElements;
    }

    private void setParagraphElements(List<iParagraphElement> paragraphElements) {
        this.paragraphElements = paragraphElements;
    }

}
