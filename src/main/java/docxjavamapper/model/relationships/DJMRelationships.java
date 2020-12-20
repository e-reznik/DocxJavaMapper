package docxjavamapper.model.relationships;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;
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
