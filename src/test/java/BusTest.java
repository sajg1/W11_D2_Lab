import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BusTest {
    private Bus bus;
    private Person person;

    @Before
    public void before() {
        bus = new Bus("Nowhere", 1);
        person = new Person();
    }

    @Test
    public void canReturnNoOfPassengers() {
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void cannotAddMoreThanCapacity() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengers());
        bus.removePassenger();
        assertEquals(0, bus.getPassengers());
    }
}