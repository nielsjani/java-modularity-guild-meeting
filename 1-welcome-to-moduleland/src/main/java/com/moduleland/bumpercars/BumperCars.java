package main.java.com.moduleland.bumpercars;

import main.java.com.moduleland.RideInitializer;
import main.java.com.moduleland.Ticket;
import main.java.com.moduleland.TicketStamper;

public class BumperCars {

    public void ride(Ticket ticket) {
        TicketStamper.stamp(ticket);
        SafetyChecker.checkSafety();
        new RideInitializer().startRide("bump-o-rama 1999");
    }
}
