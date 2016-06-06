package app.model;

import java.util.Date;
import java.util.List;

/**
 * Created by mda on 5/13/16.
 */
public class Contact {
    Long id;
    Long uid ;
    String firstName;
    String lastName;

    Address address;

    List<String> phones;
    List<String> emails;

    String photoPath;
    Date birthday;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (!firstName.equals(contact.firstName)) return false;
        return lastName.equals(contact.lastName);

    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}
