package docxjavamapper.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import docxjavamapper.model.interfaces.ParagraphElement;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DJMHyperlink implements ParagraphElement {

    @XmlElement(name = "r")
    DJMRun run;
    @XmlAttribute(name = "id", namespace="http://schemas.openxmlformats.org/officeDocument/2006/relationships")
    String id;

}
