package docxjavamapper.model.drawing.graphic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMPic {

    @XmlElement(namespace = "http://schemas.openxmlformats.org/drawingml/2006/picture")
    DJMnvPicPr nvPicPr;

}
