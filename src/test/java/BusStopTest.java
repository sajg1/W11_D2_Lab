import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop("Nowhere");
        person = new Person();
    }

    @Test
    public void hasName() {
        assertEquals("Nowhere", busStop.getName());
    }

    @Test
    public void queueStartsEmpty() {
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void addPersonToQueue() {
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void removePersonFromQueue() {
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.queueCount());
    }
}
