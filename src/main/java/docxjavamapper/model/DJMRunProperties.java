package docxjavamapper.model;

import docxjavamapper.model.properties.DJMColor;
import docxjavamapper.model.properties.DJMFont;
import docxjavamapper.model.properties.FontSize;
import docxjavamapper.model.properties.Highlight;
import docxjavamapper.model.properties.adapter.BoldAdapter;
import docxjavamapper.model.properties.adapter.ItalicAdapter;
import docxjavamapper.model.properties.adapter.StrikeAdapter;
import docxjavamapper.model.properties.adapter.UnderlineAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * rPr (Run Properties)
 *
 * This element specifies a set of run properties which shall be applied to the
 * contents of the parent run after all style formatting has been applied to the
 * text. These properties are defined as direct formatting, since they are
 * directly applied to the run and supersede any formatting from styles.
 *
 * This formatting is applied at the following location in the style hierarchy:
 *
 * Document defaults
 *
 * Table styles
 *
 * Numbering styles
 *
 * Paragraph styles
 *
 * Character styles
 *
 * Direct formatting (this element)
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMRunProperties {

    @XmlElement
    DJMColor color;
    @XmlElement
    Highlight highlight;
    @XmlElement(name = "rFonts")
    DJMFont font;
    @XmlElement(name = "sz")
    FontSize fontSize;
    @XmlElement(name = "b")
    @XmlJavaTypeAdapter(BoldAdapter.class)
    @Getter(AccessLevel.NONE)
    Boolean isBold = false;
    @XmlElement(name = "i")
    @XmlJavaTypeAdapter(ItalicAdapter.class)
    @Getter(AccessLevel.NONE)
    Boolean isItalic = false;
    @XmlElement(name = "u")
    @XmlJavaTypeAdapter(UnderlineAdapter.class)
    @Getter(AccessLevel.NONE)
    Boolean isUnderline = false;
    @XmlElement(name = "strike")
    @XmlJavaTypeAdapter(StrikeAdapter.class)
    @Getter(AccessLevel.NONE)
    Boolean isStrike = false;

    public Boolean isBold() {
        return isBold;
    }

    public Boolean isItalic() {
        return isItalic;
    }

    public Boolean isUnderline() {
        return isUnderline;
    }

    public Boolean isStrike() {
        return isStrike;
    }
}
