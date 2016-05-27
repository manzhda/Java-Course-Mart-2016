package reflection;

import java.io.Serializable;

/**
 * Created by mda on 5/13/16.
 */
public class TestReflection implements CustomInterface, Serializable{
    private String name;
    private String lastName = "default";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
