package biz.davidpearson.androidmultimodulejacocodemo.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by David Pearson (greco) on 2020-04-24.
 */
public class MxyztplkTest {

    private Mxyztplk mxyztplk;


    @Before
    public void setUp() throws Exception {
        mxyztplk =
                Mxyztplk.MxyztplkBuilder.aMxyztplk().withYear(1944).withEra("Bronze")
                        .build();
    }

    @Test
    public void getYear() {
        assertEquals(1944, mxyztplk.getYear());
    }

    @Test
    public void getEra() {
        assertEquals("Bronze", mxyztplk.getEra());
    }

    @Test
    public void testToString() {
        assertEquals("Mxyztplk{year=1944, era='Bronze'}", mxyztplk.toString());
    }
}