package docxjavamapper.model.drawing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMExtent {

    @XmlAttribute
    private int cx;
    @XmlAttribute
    private int cy;

}
