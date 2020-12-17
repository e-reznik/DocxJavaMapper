package docxjavamapper.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import docxjavamapper.model.interfaces.BodyElement;

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
