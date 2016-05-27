package oop;

import oop.pat.*;

import java.util.Date;
import java.util.List;

/**
 * Created by mda on 4/29/16.
 */
public abstract class AbstractVehicle implements Vechicle, VechicleDrive{

    protected Engine engine;

    private Body body;
    private Transmission transmission;
    private AirConditioner conditioner;

    private List<Wheel> wheels;

    private String name;
    private String model;
    private Date age;
    private long mileage;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public AirConditioner getConditioner() {
        return conditioner;
    }

    public void setConditioner(AirConditioner conditioner) {
        this.conditioner = conditioner;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public void moveLeft() {
        System.out.println("moveLeft");
    }

    @Override
    public void moveRight() {
        System.out.println("moveRight");
    }

    @Override
    public void moveBack() {
        System.out.println("moveBack");
    }

    @Override
    public void brake() {
        System.out.println("brake");
    }

    @Override
    public void left() {
        moveLeft();
    }

    @Override
    public void right() {
        moveRight();
    }

    @Override
    public void forward() {
        move();
    }

    @Override
    public void back() {
        moveBack();
    }

    @Override
    public void speed(int speed) {
        System.out.println("current speed is = " + speed);
    }
}
