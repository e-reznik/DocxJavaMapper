package docxjavamapper.model.table;

import docxjavamapper.model.DJMParagraph;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMTableCell {

    @XmlElement(name = "p")
    private List<DJMParagraph> paragraph;

}
