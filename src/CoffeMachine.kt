import java.util.*


const val BUY = "buy";
const val FILL = "fill";
const val TAKE = "take";
const val REMAINING = "remaining";


var water = 400
var milk = 540
var coffeeBeans = 120
var cups = 9
var money = 550

val scanner = Scanner(System.`in`)

fun main() {
    action()
}

fun showQtd() {
    println("The coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$coffeeBeans of coffee beans")
    println("$cups of disposable cups")
    println("$money of money")

    action()
}

fun action() {
    println("Write action (buy, fill, take, remaining, exit):")

    when (scanner.next()) {
        BUY -> buy()
        FILL -> fill()
        TAKE -> take()
        REMAINING -> showQtd()
    }
}

fun buy() {
    println("What do you want to buy? 1- espresso, 2 - latte, 3 - cappuccino, back - to main menu")

    when (scanner.next()) {
        "1" -> espresso()
        "2" -> latte()
        "3" -> cappuccion()
    }

    action()
}

fun fill() {
    println("Write how many ml of water do you want to add:")
    water += scanner.nextInt()
    println("Write how many ml of milk do you want to add:")
    milk += scanner.nextInt()
    println("Write how many grams of coffee beans do you want to add:")
    coffeeBeans += scanner.nextInt()
    println("Write how many disposable cups of coffee do you want to add:")
    cups += scanner.nextInt()

    action()
}

fun take() {
    println("I gave you $$money")
    money = 0

    action()
}

fun espresso() {

    if (water >= 250) {

        if (coffeeBeans >= 16) {

            if (cups >= 1) {

                println("I have enough resources, making you a coffee!")
                water -= 250
                coffeeBeans -= 16
                money += 4
                cups--

            } else {
                println("Sorry, not enough Cups")
            }
        } else {
            println("Sorry, not enough Coffee Beans")
        }
    } else {
        println("Sorry, not enough Water")
    }
}

fun latte() {

    if (water >= 350) {

        if (milk >= 75) {

            if (coffeeBeans >= 20) {

                if (cups >= 1) {
                    println("I have enough resources, making you a coffee!")
                    water -= 350
                    milk -= 75
                    coffeeBeans -= 20
                    money += 7
                    cups--

                } else {
                    println("Sorry, not enough Cups")
                }
            } else {
                println("Sorry, not enough Coffee Beans")
            }
        } else {
            println("Sorry, not enough Milk")
        }
    } else {
        println("Sorry, not enough Water")
    }
}

fun cappuccion() {
    if (water >= 200) {

        if (milk >= 100) {

            if (coffeeBeans >= 12) {

                if (cups >= 1) {
                    println("I have enough resources, making you a coffee!")
                    water -= 200
                    milk -= 100
                    coffeeBeans -= 12
                    money += 6
                    cups--

                } else {
                    println("Sorry, not enough Cups")
                }
            } else {
                println("Sorry, not enough Coffee Beans")
            }
        } else {
            println("Sorry, not enough Milk")
        }
    } else {
        println("Sorry, not enough Water")
    }
}
