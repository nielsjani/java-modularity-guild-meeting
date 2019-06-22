package main.java.com.moduleland;

import main.java.com.moduleland.bumpercars.BumperCars;
import main.java.com.moduleland.bumpercars.SafetyChecker;
import main.java.com.moduleland.rollercoaster.Roller;
import main.java.com.moduleland.rollercoaster.RollerCoaster;

public class Main {

    public static void main(String[] args) {
        Ticket rollerCoasterTicket = new Ticket();
        new RollerCoaster().rideRollerCoaster(rollerCoasterTicket);
        Ticket bumperCarsTicket = new Ticket();
        new BumperCars().ride(bumperCarsTicket);

        //The following should not compile:
        SafetyChecker.checkSafety();
        new Roller();
        new RideInitializer();
        TicketStamper.stamp(new Ticket());
    }
}
