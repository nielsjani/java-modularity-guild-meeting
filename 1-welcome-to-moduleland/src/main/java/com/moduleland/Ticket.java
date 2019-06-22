package main.java.com.moduleland;

public class Ticket {
    private boolean isStamped;

    public void stamp() {
        if(isStamped) {
            throw new IllegalArgumentException("This ticket was already stamped!");
        }
        isStamped = true;
    }
}
