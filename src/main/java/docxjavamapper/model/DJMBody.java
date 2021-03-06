package docxjavamapper.model;

import docxjavamapper.model.interfaces.BodyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import java.util.List;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

/**
 * The container for the block level structures such as paragraphs, tables,
 * annotations, and others specified in the ISO/IEC 29500 specification.
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DJMBody {

    List<BodyElement> bodyElements;

    @XmlElements({
        @XmlElement(name = "p", type = DJMParagraph.class),
        @XmlElement(name = "tbl", type = DJMTable.class)
    })

    public List<BodyElement> getBodyElements() {
        return bodyElements;
    }

    private void setBodyElements(List<BodyElement> bodyElements) {
        this.bodyElements = bodyElements;
    }
}
