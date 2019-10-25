package deqo.dlat.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    Item i1;
    Item i2;

    @Before
    public void testInit(){
        i1=new Item(1);
        i2=new Item(2);
    }

    @Test
    public void testGetValue(){
        assertEquals(1, i1.getValue());
        assertEquals(2, i2.getValue());
    }

    @Test
    public void testSetValue(){
        i1.setValue(2);
        i2.setValue(3);
        assertEquals(2, i1.getValue());
        assertEquals(3, i2.getValue());
    }
}