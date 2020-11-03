package maschine

import maschine.kaffeeSorten.Cappuccino
import maschine.kaffeeSorten.Espresso
import maschine.kaffeeSorten.Latte
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val kaffeeMaschine = KaffeeMaschine()
    var angeschaltet = true


    while (angeschaltet) {
        print("Drücke einen Knopf (k = kaufen, f = füllen, n = Geld herausnehmen, v = verbleibende Zutaten, a = ausschalten): ")

        val input = readLine()
        print("\n")
        when (input) {
            "k" -> {
                print("Was willst du kaufen? 1 - Espresso, 2 - Latte, 3 - Cappuccino, z - zurück zum Start: ")
                when (scanner.next()) {
                    "1" -> kaffeeMaschine.kaufen(Espresso)
                    "2" -> kaffeeMaschine.kaufen(Latte)
                    "3" -> kaffeeMaschine.kaufen(Cappuccino)
                    "back" -> { }
                    else -> println("Aktion nicht definiert")
                }
            }
            "f" -> {
                print("Schreibe, wie viel ml Wasser du hinzufügen möchtest: ")
                val addWater = scanner.nextInt()

                print("Schreibe, wie viel ml Milch du hinzufügen möchtest: ")
                val addMilk = scanner.nextInt()

                print("Schreibe, wie viel g Kaffeebohnen du hinzufügen möchtest: ")
                val addBeans = scanner.nextInt()

                print("Schreibe, wie viel Kaffeetassen du hinzufügen möchtest ")
                val addCups = scanner.nextInt()

                kaffeeMaschine.nachfüllen(addWater, addMilk, addBeans, addCups)
            }
            "n" -> kaffeeMaschine.geldNehmen()
            "v" -> kaffeeMaschine.verbleibend()
            "a" -> angeschaltet = false
        }
        print("\n")
    }
}
