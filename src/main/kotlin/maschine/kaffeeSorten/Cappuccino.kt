package maschine.kaffeeSorten

import maschine.Kaffee

object Cappuccino: Kaffee() {
    override val preis: Int
        get() = 6
    override val wasser: Int
        get() = 200
    override val milch: Int
        get() = 100
    override val bohnen: Int
        get() = 12
}