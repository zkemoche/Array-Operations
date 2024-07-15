package AssignmentQ5;

public class AirlineReservationSystem {
    public static void main(String[] args) {
        CheckInBoarding checkInBoarding = new CheckInBoarding();
        PassengerList passengerList = new PassengerList();
        FlightSchedule flightSchedule = new FlightSchedule();

        // Managing Check-in and Boarding
        checkInBoarding.checkIn("Joy");
        checkInBoarding.checkIn("Kimani");
        checkInBoarding.checkIn("Alex");
        checkInBoarding.checkIn("Richard");
        checkInBoarding.checkIn("Faith");
        checkInBoarding.checkIn("Hope");
        checkInBoarding.checkIn("Imani");
        checkInBoarding.checkIn("Stanley");
        checkInBoarding.board();
        checkInBoarding.showBoardingQueue();

        // Managing Passenger List
        passengerList.addPassenger("Joy");
        passengerList.addPassenger("Kimani");
        passengerList.addPassenger("Alex");
        passengerList.addPassenger("Hope");
        passengerList.addPassenger("Stanley");
        passengerList.showPassengers();
        passengerList.removePassenger("Alex");
        passengerList.showPassengers();

        // Managing Flight Schedule
        flightSchedule.addFlight("08:00", "Flight 101");
        flightSchedule.addFlight("12:00", "Flight 202");
        flightSchedule.showSchedule();
        flightSchedule.removeFlight("08:00");
        flightSchedule.showSchedule();
    }
}

