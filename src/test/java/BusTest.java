import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class BusTest {

    Bus bus;
    Person person;
    Person person2;


    @Before
    public void before(){
        bus = new Bus("The Jewel", 1);
        person = new Person();
        person2 = new Person();
    }


    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busCanAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void busCanNotAddPassengerIfAtCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(person2);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void busCanRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }








}
