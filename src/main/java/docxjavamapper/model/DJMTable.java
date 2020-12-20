package docxjavamapper.model;

import docxjavamapper.model.interfaces.BodyElement;
import docxjavamapper.model.table.DJMTableRow;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMTable implements BodyElement {

    @XmlElement(name = "tr")
    List<DJMTableRow> tableRows;

}
