package docxjavamapper.model.properties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMFont {

    @XmlAttribute(name = "ascii", namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main")
    private String value;

}
