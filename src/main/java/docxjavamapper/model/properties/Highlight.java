package docxjavamapper.model.properties;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class Highlight {

    @XmlAttribute(name = "val", namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main")
    String value;

}
