package biz.davidpearson.mylibrarythree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by David Pearson (greco) on 2020-04-29.
 */
public class PigglywigglyTest {

    @Test
    public void getLocation() {
        Pigglywiggly pigglywiggly = new Pigglywiggly("over on main street");

        assertEquals("over on main street", pigglywiggly.getLocation());
    }

    @Test
    public void setLocation() {
        Pigglywiggly pigglywiggly = new Pigglywiggly("over on main street");

        pigglywiggly.setLocation("next town over");
        assertEquals("next town over", pigglywiggly.getLocation());
    }

    @Test
    public void testToString() {
        Pigglywiggly pigglywiggly = new Pigglywiggly("over on main street");

        assertEquals("Pigglywiggly{location='over on main street'}", pigglywiggly.toString());
    }
}