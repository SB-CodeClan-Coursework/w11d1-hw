import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void volume_starts_at_100(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void can_drink_10_units_from_water_bottle(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void can_empty_water_bottle(){
        assertEquals(0, waterbottle.empty());
    }
    
    @Test
    public void can_fill_bottle_by_100_units(){
        WaterBottle emptyBottle = new WaterBottle(0);
        assertEquals(100, emptyBottle.fill());
    }
}
