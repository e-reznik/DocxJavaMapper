package docxjavamapper.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * numId (Numbering Definition Instance Reference)
 *
 * This element specifies the numbering definition instance which shall be
 * used for the given parent paragraph. A value of 0 indicates that this
 * paragraph shall not have any numbering.
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMNumberingId {

    @XmlAttribute(name = "val", namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main")
    Integer value;

}
