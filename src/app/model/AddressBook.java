package app.model;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by mda on 5/13/16.
 */
public interface AddressBook {
    boolean add(Contact contact);
    boolean add(Collection<Contact> contacts);

    boolean remove(Contact contact);
    boolean edit(Contact contact);

    Set<Contact> getContacts();

    Contact getContact(Long id);

    Set<Contact> search(Contact contact);
}
