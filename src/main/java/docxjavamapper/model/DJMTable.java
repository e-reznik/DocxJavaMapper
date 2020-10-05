package docxjavamapper.model;

import docxjavamapper.model.table.DJMTableRow;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMTable {

    @XmlElement(name = "tr")
    private List<DJMTableRow> tableRows;

}
