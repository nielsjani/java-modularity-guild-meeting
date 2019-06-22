package moduleland.main;


import moduleland.ride.bumpercars.api.BumperCars;
import moduleland.ride.rollercoaster.api.RollerCoaster;
import moduleland.ride.ticket.api.Ticket;

public class Main {

    public static void main(String[] args) {
        Ticket rollerCoasterTicket = new Ticket();
        new RollerCoaster().rideRollerCoaster(rollerCoasterTicket);
        Ticket bumperCarsTicket = new Ticket();
        new BumperCars().ride(bumperCarsTicket);

        //The following should not compile:
//        SafetyChecker.checkSafety();
//        new Roller();
//        new RideInitializer();
//        TicketStamper.stamp(new Ticket());
    }
}
