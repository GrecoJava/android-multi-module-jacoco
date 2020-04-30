package biz.davidpearson.androidmultimodulejacocodemo.model

/**
 * Created by David Pearson (greco) on 2020-04-24.
 */
data class Mork private constructor(val builder: Mork.Builder) {

    private val naNuNaNu: String?

    init {
        this.naNuNaNu = builder.naNuNaNu
    }

    class Builder {
        var naNuNaNu: String? = null
            private set

        fun naNuNaNu(naNuNaNu: String) = apply { this.naNuNaNu = naNuNaNu }

        fun build() = Mork(this)
    }

    override fun toString(): String {
        return "Mork(naNuNaNu=$naNuNaNu)"
    }
}
