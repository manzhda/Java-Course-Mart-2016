package oop.pat;

/**
 * Created by mda on 4/29/16.
 */
public class Gas extends AbstractICE {
    @Override
    public void run() {
        System.out.println("run gas");
    }

    @Override
    public void stop() {
        System.out.println("stop gas");
    }
}
