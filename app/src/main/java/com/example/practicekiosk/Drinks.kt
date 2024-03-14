package com.example.practicekiosk

val drinkslist = listOf(
    Coke("Coke", 2.0, "콜라"),
    Sprite("Sprite", 2.0, "사이다"),
    ZeroCoke("Zero Coke", 2.0, "제로 콜라"),
    ZeroSprite("Zero Sprite", 2.0, "제로 사이다"),
    VanillaShake("Vanilla Shake", 4.0, "바닐라 쉐이크")
)

abstract class Drinks {
    abstract val name: String
    abstract val price: Double
    abstract val description: String
}

data class Coke(
    override val name: String,
    override val price: Double,
    override val description: String
) : Drinks()

data class Sprite(
    override val name: String,
    override val price: Double,
    override val description: String
) : Drinks()

data class ZeroCoke(
    override val name: String,
    override val price: Double,
    override val description: String
) : Drinks()

data class ZeroSprite(
    override val name: String,
    override val price: Double,
    override val description: String
) : Drinks()

data class VanillaShake(
    override val name: String,
    override val price: Double,
    override val description: String
) : Drinks()


/*class Drinks {
    init {
        drinksMenu()
    }

    data class DrinksInfo(val name: String, val price: Double, val description: String)

    fun drinksMenu() {

        val drinksList = listOf(
            DrinksInfo("Coke", 6.9, "콜라"),
            DrinksInfo("Sprite", 8.9, "사이다"),
            DrinksInfo("Zero Coke", 9.4, "제로 콜라"),
            DrinksInfo("Zero Sprite", 6.9, "제로 사이다"),
            DrinksInfo("Vanilla Shake", 5.4, "바닐라 쉐이크"),
        )

        for (index in drinksList.indices) {
            val drinksmenu = drinksList[index]
            println("${index + 1}. ${drinksmenu.name} | W${drinksmenu.price} | ${drinksmenu.description}")
        }
        var drinksSelect = readln().toInt()

        when (drinksSelect) {
            1 -> println("Coke를 선택하셨습니다 잠시만 기다려주세요")
            2 -> println("Sprite를 선택하셨습니다 잠시만 기다려주세요")
            3 -> println("Zero Coke를 선택하셨습니다 잠시만 기다려주세요")
            4 -> println("Zero Sprite를 선택하셨습니다 잠시만 기다려주세요")
            5 -> println("Vanilla Shake를 선택하셨습니다 잠시만 기다려주세요")
            0 -> return
        }
    }
}
 */
