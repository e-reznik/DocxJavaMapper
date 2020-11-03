package docxjavamapper.model.relationships;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * The container for the block level structures such as paragraphs, tables,
 * annotations, and others specified in the ISO/IEC 29500 specification.
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlRootElement(name = "Relationships")
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMRelationships {

    @XmlElement(name = "Relationship")
    List<DJMRelationship> relationships;

}
