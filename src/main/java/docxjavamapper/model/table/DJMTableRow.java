package docxjavamapper.model.table;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMTableRow {

    @XmlElement(name = "tc")
    private List<DJMTableCell> tableCell;

}
