package biz.davidpearson.androidmultimodulejacocodemo.model

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by David Pearson (greco) on 2020-04-26.
 */
class MorkTest {

    @Test
    fun testToString() {
        val mork = Mork.Builder().naNuNaNu("Shazbot").build()
        assertEquals("Mork(naNuNaNu=Shazbot)", mork.toString())
    }

//    @Test
//    fun testEquals() {
//        val mork1 = Mork.Builder().naNuNaNu("Shazbot").build()
//        val mork2 = Mork.Builder().naNuNaNu("Shazbot").build()
//
//        assertEquals(mork1, mork2)
//    }
}