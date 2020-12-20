package docxjavamapper.model.drawing;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMPosition {

    @XmlElement(name = "posOffset", namespace = "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing")
    int posOffset;

}
