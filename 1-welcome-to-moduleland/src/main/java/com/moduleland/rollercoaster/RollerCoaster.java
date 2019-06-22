package main.java.com.moduleland.rollercoaster;

import main.java.com.moduleland.RideInitializer;
import main.java.com.moduleland.Ticket;
import main.java.com.moduleland.TicketStamper;

public class RollerCoaster {

    public void rideRollerCoaster(Ticket ticket) {
        TicketStamper.stamp(ticket);
        Roller roller = new Roller();
        RideInitializer rideInitializer = this.coastRoller(roller);
        rideInitializer.startRide("Rollercoaster");
    }

    private RideInitializer coastRoller(Roller roller) {
        return roller.createRideInitializer();
    }
}
