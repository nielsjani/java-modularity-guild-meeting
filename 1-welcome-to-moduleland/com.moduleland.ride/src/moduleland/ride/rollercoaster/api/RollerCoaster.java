package moduleland.ride.rollercoaster.api;

import moduleland.ride.RideInitializer;
import moduleland.ride.rollercoaster.Roller;
import moduleland.ride.ticket.TicketStamper;
import moduleland.ride.ticket.api.Ticket;

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
