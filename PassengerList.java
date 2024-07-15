package AssignmentQ5;

import java.util.LinkedList;

/* 2. Linked Lists: For Managing Passenger Lists */

public class PassengerList {
    private LinkedList<String> passengers = new LinkedList<>();

    public void addPassenger(String passenger) {
        passengers.add(passenger);
        System.out.println(passenger + " added to the passenger list.");
    }

    public void removePassenger(String passenger) {
        passengers.remove(passenger);
        System.out.println(passenger + " removed from the passenger list.");
    }

    public void showPassengers() {
        System.out.println("Passenger List: " + passengers);
    }
}

