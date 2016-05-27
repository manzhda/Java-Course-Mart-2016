package oop.pat;

/**
 * Created by mda on 4/29/16.
 */
public class Diesel extends AbstractICE {
    @Override
    public void run() {
        System.out.println("run diesel");
    }

    @Override
    public void stop() {
        System.out.println("stop diesel");
    }
}
