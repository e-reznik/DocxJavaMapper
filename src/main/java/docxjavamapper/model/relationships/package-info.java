@XmlSchema(
        namespace = "http://schemas.openxmlformats.org/package/2006/relationships",
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns = {
            @XmlNs(prefix = "w", namespaceURI = "http://schemas.openxmlformats.org/wordprocessingml/2006/main"),
            @XmlNs(prefix = "wp", namespaceURI = "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing"),
            @XmlNs(prefix = "a", namespaceURI = "http://schemas.openxmlformats.org/drawingml/2006/main"),
            @XmlNs(prefix = "pic", namespaceURI = "http://schemas.openxmlformats.org/drawingml/2006/picture")

        }
)

package docxjavamapper.model.relationships;

import jakarta.xml.bind.annotation.XmlNs;
import jakarta.xml.bind.annotation.XmlNsForm;
import jakarta.xml.bind.annotation.XmlSchema;
