import java.time.LocalDate;

public class SeatReservation {
    
    //private variables
    private String flightDesignator;
    private LocalDate flightDate;
    private String firstName;
    private String lastName;

 // Constructor
    public SeatReservation(String flightDesignator, LocalDate flightDate, String firstName, String lastName) {
    this.flightDesignator = flightDesignator;
    this.flightDate = flightDate;
    this.firstName = firstName;
    this.lastName = lastName;
    }
    public String getFlightDesignator() {
        return flightDesignator;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setters
    public void setFlightDesignator(String flightDesignator) {
        if (flightDesignator == null || flightDesignator.length() < 4 || flightDesignator.length() > 6) {
            throw new IllegalArgumentException("Flight Designator not in range of acceptable characters.");
        }
        this.flightDesignator = flightDesignator;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // toString method
    @Override
    public String toString() {
        return "SeatReservation{" +
                "flightDesignator='" + (flightDesignator != null ? flightDesignator : "null") + '\'' +
                ", flightDate=" + (flightDate != null ? flightDate : "null") +
                ", firstName='" + (firstName != null ? firstName : "null") + '\'' +
                ", lastName='" + (lastName != null ? lastName : "null") + '\'' +
                '}';
    }


    public static void main(String[] args) {
        // Create an instance of SeatReservation
        SeatReservation reservation = new SeatReservation("AA123", LocalDate.of(2023, 8, 26), "John", "Doe");
        System.out.println(reservation.toString());

        // Testing my setters
        reservation.setLastName("Smith");
        reservation.setFlightDesignator("BB456");

        // Print modified reservation details
        System.out.println(reservation.toString());
    }
  
}

