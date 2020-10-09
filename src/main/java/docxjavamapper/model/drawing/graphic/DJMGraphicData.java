package docxjavamapper.model.drawing.graphic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMGraphicData {

    @XmlElement(namespace = "http://schemas.openxmlformats.org/drawingml/2006/picture")
    DJMPic pic;

}
