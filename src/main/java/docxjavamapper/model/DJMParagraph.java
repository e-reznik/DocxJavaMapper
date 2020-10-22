package docxjavamapper.model;

import docxjavamapper.model.interfaces.iBodyElement;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.AccessLevel;
import lombok.Getter;
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
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMParagraph implements iBodyElement {

    @XmlElement(name = "pPr")
    DJMParagraphProperties paragraphProperties;
    @XmlElement(name = "r")
    List<DJMRun> runs;
//    @XmlElement(name = "hyperlink")
//    DJMHyperlink hyperlink;

}
