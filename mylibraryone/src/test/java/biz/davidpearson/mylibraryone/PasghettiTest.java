package biz.davidpearson.mylibraryone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by David Pearson (greco) on 2020-04-29.
 */
public class PasghettiTest {

    @Test
    public void getNoodles() {
        Pasghetti pasghetti = new Pasghetti("Linguini");

        assertEquals("Linguini", pasghetti.getNoodles());
    }

    @Test
    public void setNoodles() {
        Pasghetti pasghetti = new Pasghetti("Fettuccine");

        assertEquals("Fettuccine", pasghetti.getNoodles());

        pasghetti.setNoodles("Barbine");

        assertEquals("Barbine", pasghetti.getNoodles());
    }

    @Test
    public void testToString() {
        Pasghetti pasghetti = new Pasghetti("Fettuccine");

        assertEquals("Pasghetti{noodles='Fettuccine'}", pasghetti.toString());
    }
}