import java.util.ArrayList;

public class Bus {
    private ArrayList<Person> passengers;
    private String destination;
    private int capacity;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int getPassengers() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        if (passengers.size() < capacity ) {
            passengers.add(person);
        }
    }

    public void removePassenger() {
        passengers.remove(0);
    }
}
