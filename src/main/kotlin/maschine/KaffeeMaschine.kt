package maschine

class KaffeeMaschine {

    private var wasser = 400
    private var milch = 540
    private var bohnen = 120
    private var tassen = 9
    private var geld = 550

    fun verbleibend() {
        println("Die Kaffeemaschine hat:")
        println("${wasser}ml Wasser")
        println("${milch}ml Milch")
        println("${bohnen}g Kaffeebohnen")
        println("$tassen Kaffeetassen")
        println("$geld EURO")
    }

    fun kaufen(kaffee: Kaffee?) {
        if (kaffee === null) {
            return println("Unbekannter Kaffee")
        }

        if(!genugZutaten(kaffee)) return


        geld += kaffee.preis
        wasser -= kaffee.wasser
        milch -= kaffee.milch
        bohnen -= kaffee.bohnen
        tassen--
    }

    fun nachfüllen(water: Int, milk: Int, beans: Int, cups: Int) {
        this.wasser += water
        this.milch += milk
        this.bohnen += beans
        this.tassen += cups
    }

    fun geldNehmen() {
        println("$geld EURO ausgezahlt")
        geld = 0
    }

    private fun genugZutaten(kaffee: Kaffee): Boolean {
        when {
            wasser < kaffee.wasser -> {
                println("Zu wenig Wasser!")
                return false
            }
            milch < kaffee.milch -> {
                println("Zu wenig Milch!")
                return false
            }
            bohnen < kaffee.bohnen -> {
                println("Zu wenig Kaffeebohnen!")
                return false
            }
            tassen == 0 -> {
                println("Keine Tasse übrig")
                return false
            }
            else -> {
                println("Genug da, ich mache den Kaffee!")
                return true
            }
        }
    }
}