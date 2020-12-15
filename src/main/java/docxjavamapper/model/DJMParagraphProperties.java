package docxjavamapper.model;

import docxjavamapper.model.interfaces.ParagraphElement;
import docxjavamapper.model.paragraphproperties.DJMAlignment;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import docxjavamapper.model.interfaces.ParagraphElement;

/**
 * pPr (Paragraph Properties)
 *
 * This element specifies a set of paragraph properties which shall be applied
 * to the contents of the parent paragraph after all style/numbering/table
 * properties have been applied to the text. These properties are defined as
 * direct formatting, since they are directly applied to the paragraph and
 * supersede any formatting from styles.
 *
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMParagraphProperties implements ParagraphElement {

    @XmlElement(name = "jc")
    DJMAlignment alignment;
    @XmlElement(name = "numPr")
    DJMNumberingProperties numberingProperties;

}
