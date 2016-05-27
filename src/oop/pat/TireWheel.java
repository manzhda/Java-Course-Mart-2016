package oop.pat;

/**
 * Created by mda on 4/29/16.
 */
public class TireWheel implements Wheel {
    private boolean balloon;
    private boolean season;
    private byte diameter;

    @Override
    public boolean isBalloon() {
        return balloon;
    }

    public void setBalloon(boolean balloon) {
        this.balloon = balloon;
    }

    @Override
    public boolean isWinter() {
        return season;
    }

    public void setWinter(boolean season) {
        this.season = season;
    }

    @Override
    public byte getDiameter() {
        return diameter;
    }

    public void setDiameter(byte diameter) {
        this.diameter = diameter;
    }
}
