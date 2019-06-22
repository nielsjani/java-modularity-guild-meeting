package moduleland.ride.bumpercars.api;

import moduleland.ride.RideInitializer;
import moduleland.ride.bumpercars.SafetyChecker;
import moduleland.ride.ticket.TicketStamper;
import moduleland.ride.ticket.api.Ticket;

public class BumperCars {

    public void ride(Ticket ticket) {
        TicketStamper.stamp(ticket);
        SafetyChecker.checkSafety();
        new RideInitializer().startRide("bump-o-rama 1999");
    }
}
