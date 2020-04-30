package biz.davidpearson.mylibrarytwo

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by David Pearson (greco) on 2020-04-29.
 */
class ZowzyTest {

    @Test
    fun getTshirt() {
        val zowzy = Zowzy("Sharkicorn")

        assertEquals("Sharkicorn", zowzy.tshirt)
    }
}