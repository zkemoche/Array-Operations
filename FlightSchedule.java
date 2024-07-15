package AssignmentQ5;

import java.util.TreeMap;

/* 3. Trees: For Organizing Flight Schedules and Routes */

public class FlightSchedule {
    private TreeMap<String, String> schedule = new TreeMap<>();

    public void addFlight(String time, String flight) {
        schedule.put(time, flight);
        System.out.println("Flight " + flight + " added at " + time);
    }

    public void removeFlight(String time) {
        String flight = schedule.remove(time);
        System.out.println("Flight " + flight + " removed from " + time);
    }

    public void showSchedule() {
        System.out.println("Flight Schedule: " + schedule);
    }
}

