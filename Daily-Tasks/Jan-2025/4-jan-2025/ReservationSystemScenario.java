/*1)Seat Reservation System:

You are tasked with developing a Java program for a simple seat reservation system using 

the 
ReservationSystem class.
 This class involves two custom exceptions: a checked exception (SeatUnavailableException)
  and an unchecked exception
 (InvalidReservationException). These exceptions are designed to handle different
  scenarios related to reserving seats.

* SeatUnavailableException (Checked Exception):
->This exception should be thrown when an attempt is made to reserve seats that 
are not available at the moment or when there are 
insufficient seats for the specified reservation.

* InvalidReservationException (Unchecked Exception):
->This exception should be thrown when an attempt is made to reserve seats when no
 seats are available.


* ReservationSystem Class:

-> The class should have a private instance variable availableSeats representing the
 number of available seats.
-> Implement a constructor to initialize the initial number of available seats.
-> Implement a method reserveSeat(int numberOfSeats) that reserves seats, throwing
 SeatUnavailableException for unavailability
or insufficient seats.
-> Implement a method reserveSeatUnchecked(int numberOfSeats) that simulates reserving 
seats, throwing
 InvalidReservationException for no available seats and handling SeatUnavailableException
  for insufficient seats.


* Main Class (ReservationSystemScenario):

-> In the main method, create an instance of ReservationSystem with an 
initial number of available seats (e.g., 30).
-> Demonstrate the use of reserveSeat for valid and invalid seat reservations,
 handling the SeatUnavailableException.
-> Demonstrate the use of reserveSeatUnchecked for valid and invalid seat reservations,
 handling both InvalidReservationException and SeatUnavailableException.
-> Ensure that the program provides clear error messages and handles exceptions 
appropriately.
*/

class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String message) {
        super(message);
    }
}

class InvalidReservationException extends RuntimeException {
    public InvalidReservationException(String message) {
        super(message);
    }
}

class ReservationSystem {
    private int availableSeats;

    public ReservationSystem(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void reserveSeat(int numberOfSeats) throws SeatUnavailableException {
        if (numberOfSeats > availableSeats) {
            throw new SeatUnavailableException("Not enough seats available.");
        }
        availableSeats -= numberOfSeats;
        System.out.println(numberOfSeats + " seats reserved successfully.");
    }

    public void reserveSeatUnchecked(int numberOfSeats) {
        try {
            if (availableSeats == 0) {
                throw new InvalidReservationException("No seats available.");
            }
            reserveSeat(numberOfSeats);
        } catch (SeatUnavailableException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class ReservationSystemScenario {
    public static void main(String[] args) {
        ReservationSystem system = new ReservationSystem(30);

        try {
            system.reserveSeat(10);
            system.reserveSeat(25); // This should throw SeatUnavailableException
        } catch (SeatUnavailableException e) {
            System.out.println(e.getMessage());
        }

        system.reserveSeatUnchecked(5);
        system.reserveSeatUnchecked(20); // This should handle SeatUnavailableException
        system.reserveSeatUnchecked(10); // This should throw InvalidReservationException
    }
}