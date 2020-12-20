package docxjavamapper.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * document (Document)
 *
 * This element specifies the contents of a main document part in a
 * WordprocessingML document.
 *
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlRootElement(name = "document")
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMDocument {

    @XmlElement(name = "body")
    DJMBody body;

}
