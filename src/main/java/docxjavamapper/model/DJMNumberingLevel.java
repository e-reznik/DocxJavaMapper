package docxjavamapper.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * ilvl (Numbering Level Reference)
 *
 * This element specifies the numbering level of the numbering definition
 * instance which shall be applied to the parent paragraph.
 * Level 0 is the first level, level 1 is the second level, etc.
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMNumberingLevel {

    @XmlAttribute(name = "val", namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main")
    Integer value;

}
