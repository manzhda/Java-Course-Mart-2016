package oop;

import oop.pat.Diesel;

/**
 * Created by mda on 4/29/16.
 */
public class Car extends AbstractVehicle {
    public Car() {
        engine = new Diesel();
    }

    @Override
    public String toString() {
        return "Car";
    }
}
