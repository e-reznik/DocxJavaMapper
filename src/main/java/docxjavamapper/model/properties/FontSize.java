package docxjavamapper.model.properties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class FontSize {

    @XmlAttribute(name = "val", namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main")
    float value;

}
