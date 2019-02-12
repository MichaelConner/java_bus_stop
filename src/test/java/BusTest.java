import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class BusTest {

    Bus bus;
    Person person;


    @Before
    public void before(){
        bus = new Bus("The Jewel", 10);
        person = new Person();

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








}
