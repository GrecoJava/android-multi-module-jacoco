package biz.davidpearson.mylibrarytwo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by David Pearson (greco) on 2020-04-29.
 */
public class SupercalifragilisticexpialidociousTest {

    @Test
    public void getSpoonfullCount() {
        Supercalifragilisticexpialidocious
                supercalifragilisticexpialidocious =
                new Supercalifragilisticexpialidocious(5);

        assertEquals(5, supercalifragilisticexpialidocious.getSpoonfullCount());
    }

    @Test
    public void setSpoonfullCount() {
        Supercalifragilisticexpialidocious
                supercalifragilisticexpialidocious =
                new Supercalifragilisticexpialidocious(5);

        supercalifragilisticexpialidocious.setSpoonfullCount(1);

        assertEquals(1, supercalifragilisticexpialidocious.getSpoonfullCount());
    }

    @Test
    public void testToString() {
        Supercalifragilisticexpialidocious
                supercalifragilisticexpialidocious =
                new Supercalifragilisticexpialidocious(5);

        assertEquals("Supercalifragilisticexpialidocious{spoonfullCount=5}",
                supercalifragilisticexpialidocious.toString());
    }
}