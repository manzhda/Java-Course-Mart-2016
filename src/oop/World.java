package oop;

import oop.pat.AbstractICE;
import oop.pat.Diesel;
import oop.pat.Engine;
import oop.pat.VechicleDrive;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mda on 4/29/16.
 */
public class World {
    public static void main(String[] args) {

        Vechicle bike = new Motorbike();
        Vechicle car = new Car();


        List<Vechicle> vechicles = new ArrayList<>();

        vechicles.add(bike);
        vechicles.add(car);


        for (Vechicle vechicle: vechicles) {
            System.out.println("________________________");

            vechicle.move();
            vechicle.moveLeft();
            vechicle.moveRight();
            vechicle.moveBack();


            System.out.println("________________________");
        }

        VechicleDrive bike2 = new Motorbike();

        AbstractVehicle bike3 = new Motorbike();
        Motorbike bike4 = new Motorbike();
        bike4.setEngine(new Diesel());

        bike4.isCarriage();


        VechicleDrive  car2 = new Car();
        Car  car3 = new Car();

        List<AbstractVehicle> abstractVehicles = new ArrayList<>();


//        abstractVehicles.add(bike2);  //error
        abstractVehicles.add(bike3);
        abstractVehicles.add(bike4);
//        abstractVehicles.add(car2);  //error
        abstractVehicles.add(car3);

        for (AbstractVehicle vehicle: abstractVehicles) {
//            vechicles.isCarriage(); //error

            System.out.println(vehicle);

            Engine engine = vehicle.getEngine();
            engine.run();

            System.out.println("_______________________");

        }

//        vechicles.add(bike2);

    }
}
