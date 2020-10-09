package docxjavamapper.model.drawing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMAnchor {

    @XmlElement(namespace = "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing")
    DJMPosition positionH;
    @XmlElement(namespace = "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing")
    DJMPosition positionV;
    @XmlElement(namespace = "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing")
    DJMExtent extent;
    @XmlElement(namespace = "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing")
    DJMDocPr docPr;

}
