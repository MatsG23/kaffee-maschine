package maschine.kaffeeSorten

import maschine.Kaffee

object Latte: Kaffee() {
    override val preis: Int
        get() = 7
    override val wasser: Int
        get() = 350
    override val milch: Int
        get() = 75
    override val bohnen: Int
        get() = 20
}