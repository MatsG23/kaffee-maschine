package maschine.kaffeeSorten

import maschine.Kaffee

object Espresso: Kaffee() {
    override val preis: Int
        get() = 4
    override val wasser: Int
        get() = 250
    override val milch: Int
        get() = 0
    override val bohnen: Int
        get() = 16
}