package docxjavamapper.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * numPr (Numbering Properties)
 *
 * This element specifies that the current paragraph references a numbering
 * definition instance in the current document. The presence of this element
 * specifies that the paragraph will be assigned the associated number.
 *
 * Child elements:
 * - ilvl: Numbering Level Reference (0-based indentation level)
 * - numId: Numbering Definition Instance Reference
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMNumberingProperties {

    /**
     * ilvl (Numbering Level Reference)
     * Specifies the numbering level of the numbering definition instance
     * which shall be applied to the parent paragraph.
     */
    @XmlElement(name = "ilvl")
    DJMNumberingLevel level;

    /**
     * numId (Numbering Definition Instance Reference)
     * Specifies the numbering definition instance which shall be used
     * for the given parent paragraph.
     */
    @XmlElement(name = "numId")
    DJMNumberingId numberingId;

}
