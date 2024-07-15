package AssignmentQ5;
import java.util.LinkedList;
import java.util.Queue;

/* 1. Queues: For Managing Check-in and Boarding Processes */

public class CheckInBoarding {
    private Queue<String> checkInQueue = new LinkedList<>();
    private Queue<String> boardingQueue = new LinkedList<>();

    public void checkIn(String passenger) {
        checkInQueue.add(passenger);
        System.out.println(passenger + " checked in.");
    }

    public void board() {
        if (!checkInQueue.isEmpty()) {
            String passenger = checkInQueue.poll();
            boardingQueue.add(passenger);
            System.out.println(passenger + " is boarding.");
        } else {
            System.out.println("No passengers to board.");
        }
    }

    public void showBoardingQueue() {
        System.out.println("Boarding Queue: " + boardingQueue);
    }
}

