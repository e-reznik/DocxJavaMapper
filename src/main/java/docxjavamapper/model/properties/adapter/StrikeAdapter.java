package docxjavamapper.model.properties.adapter;

import docxjavamapper.model.properties.Strike;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class StrikeAdapter extends XmlAdapter<Strike, Boolean> {

    @Override
    public Strike marshal(final Boolean v) {
        return v != null && v ? new Strike() : null;
    }

    @Override
    public Boolean unmarshal(final Strike v) {
        return true;
    }
}
