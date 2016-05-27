package oop;

import oop.pat.Gas;

/**
 * Created by mda on 4/29/16.
 */
public class Motorbike extends AbstractVehicle {

    private boolean carriage;

    public Motorbike() {
        engine = new Gas();
    }

    @Override
    public void move() {
        System.out.print("be careful ");
        super.move();
    }


    public boolean isCarriage(){
        return carriage;
    }

    @Override
    public String toString() {
        return "Motorbike";
    }
}
