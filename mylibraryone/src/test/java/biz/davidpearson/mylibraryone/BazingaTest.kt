package biz.davidpearson.mylibraryone

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by David Pearson (greco) on 2020-04-29.
 */
class BazingaTest {

    @Test
    fun getRoomMateAgreement() {
        val bazinga = Bazinga("Sheldon Lee Cooper");

        assertEquals("Sheldon Lee Cooper", bazinga.roomMateAgreement)
    }
}