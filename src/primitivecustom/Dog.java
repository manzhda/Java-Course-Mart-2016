package primitivecustom;

/**
 * Created by alexe on 22.04.2016.
 */
public class Dog {
    String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    public void SetName(String dogName) {
        this.dogName = dogName;
    }

    public String GetName() {
        return this.dogName;
    }
}