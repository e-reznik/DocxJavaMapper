package docxjavamapper.model;

import docxjavamapper.model.interfaces.iBodyElement;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

/**
 * The container for the block level structures such as paragraphs, tables,
 * annotations, and others specified in the ISO/IEC 29500 specification.
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DJMBody {

    List<iBodyElement> bodyElements;

    @XmlElements({
        @XmlElement(name = "p", type = DJMParagraph.class),
        @XmlElement(name = "tbl", type = DJMTable.class)
    })

    public List<iBodyElement> getBodyElements() {
        return bodyElements;
    }

    private void setBodyElements(List<iBodyElement> bodyElements) {
        this.bodyElements = bodyElements;
    }
}
