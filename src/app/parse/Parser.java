package app.parse;

import app.model.Contact;

import java.io.InputStream;
import java.util.Set;

/**
 * Created by mda on 5/13/16.
 */
public interface Parser {
    Set<Contact> parse(String data);
    Set<Contact> parse(InputStream data);
}
