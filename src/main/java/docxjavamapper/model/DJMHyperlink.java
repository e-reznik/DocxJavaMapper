package docxjavamapper.model;

import docxjavamapper.model.interfaces.ParagraphElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DJMHyperlink implements ParagraphElement {

    @XmlElement(name = "r")
    DJMRun run;
    @XmlAttribute(name = "id", namespace="http://schemas.openxmlformats.org/officeDocument/2006/relationships")
    String id;

}
