package machine
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val coffeeMachine = CoffeeMachine()

    while (coffeeMachine.power) {
        println("Write action (buy, fill, take, remaining, exit): ")
        when (scanner.next()) {
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                when (scanner.next()) {
                    "1" -> coffeeMachine.buy(1)
                    "2" -> coffeeMachine.buy(2)
                    "3" -> coffeeMachine.buy(3)
                    "back" -> {}
                }
            }
            "fill" -> {
                var i = 0
                while (i < 4) {
                    i++
                    coffeeMachine.fill(i)
                    coffeeMachine.howMany(i, scanner.nextInt())
                }
            }
            "take" -> coffeeMachine.take()
            "remaining" -> coffeeMachine.remaining()
            "exit" -> coffeeMachine.turnOf()
        }
        println()
    }
}

data class CoffeeMachine(var money: Int = 550,
                         var water: Int = 400,
                         var milk: Int = 540,
                         var coffee: Int = 120,
                         var cups: Int = 9,
                         var power: Boolean = true) {

    fun remaining() {
        println("The coffee machine has: ")
        println("$water of water")
        println("$milk of milk")
        println("$coffee of coffee beans")
        println("$cups of disposable cups")
        println("$money of money")
    }

    private fun verify(option: Coffee): Boolean {
        when {
            water < option.water -> {
                println("Sorry, not enough water!")
                return false
            }
            milk < option.milk -> {
                println("Sorry, not enough milk!")
                return false
            }
            coffee < option.coffee -> {
                println("Sorry, not enough coffee beans!")
                return false
            }
            cups < option.cups -> {
                println("Sorry, not enough disposable cups!")
                return false
            }
        }
        return true
    }

    private fun make(option: Coffee) {
        this.water -= option.water
        this.milk -= option.milk
        this.coffee -= option.coffee
        this.cups -= option.cups
        this.money += option.money
    }

    fun turnOf() {
        this.power = false
    }

    fun buy (option: Int) {
        when (option) {
            1 -> {
                if (verify(Coffee.ESPRESSO)) {
                    make(Coffee.ESPRESSO)
                } else return
            }
            2 -> {
                if (verify(Coffee.LATTE)) {
                    make(Coffee.LATTE)
                } else return
            }
            3 -> {
                if (verify(Coffee.CAPPUCCINO)) {
                    make(Coffee.CAPPUCCINO)
                } else return
            }
        }
        println("I have enough resources, making you a coffee!")
    }

    fun fill(item: Int) {
        when (item) {
            1 -> println("Write how many ml of water do you want to add: ")
            2 -> println("Write how many ml of milk do you want to add: ")
            3 -> println("Write how many grams of coffee beans do you want to add: ")
            4 -> println("Write how many disposable cups of coffee do you want to add: ")
        }
    }

    fun howMany(item: Int, quantity: Int) {
        when (item) {
            1 -> this.water += quantity
            2 -> this.milk += quantity
            3 -> this.coffee += quantity
            4 -> this.cups += quantity
        }
    }

    fun take() {
        println("I gave you \$$money ")
        this.money = 0
    }
}

enum class Coffee(val water: Int, val milk: Int, val coffee: Int, val cups: Int, val money: Int) {
    ESPRESSO(250, 0, 16, 1, 4),
    LATTE(350, 75, 20, 1, 7),
    CAPPUCCINO(200, 100, 12, 1, 6);
}
