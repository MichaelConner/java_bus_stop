import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {


    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("The Jewel", 10);
        person = new Person();
        busStop = new BusStop("Hunter's Hall Park");
    }

    @Test
    public void testQueueEmpty(){
        assertEquals(0, busStop.queueSize());
    }

    @Test
    public void testQueueHasPerson(){
        busStop.addPerson(person);
        assertEquals(1, busStop.queueSize());
    }

    @Test
    public void testRemovePersonFromQueue(){
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(0, busStop.queueSize());
    }



}
