package docxjavamapper.model.properties.adapter;

import docxjavamapper.model.properties.Underline;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class UnderlineAdapter extends XmlAdapter<Underline, Boolean> {

    @Override
    public Underline marshal(final Boolean v) {
        return v != null && v ? new Underline() : null;
    }

    @Override
    public Boolean unmarshal(final Underline v) {
        return true;
    }
}
