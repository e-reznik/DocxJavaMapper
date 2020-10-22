package docxjavamapper.model;

import docxjavamapper.model.interfaces.iBodyElement;
import docxjavamapper.model.table.DJMTableRow;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMTable implements iBodyElement {

    @XmlElement(name = "tr")
    List<DJMTableRow> tableRows;

}
