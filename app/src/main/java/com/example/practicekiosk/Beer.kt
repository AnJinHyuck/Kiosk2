package com.example.practicekiosk

val beerlist = listOf(
    Cass("Cass", 4.0, "전통 카스"),
    Cloud("Cloud", 4.0, "MZ 클라우드"),
    Beer1("Beer1", 5.0, "생맥주"),
    Beer2("Beer2", 5.0, "죽은 맥주"),
    CreemBeer("Beer3", 6.0, "크림 맥주")
)

abstract class Beer {
    abstract val name: String
    abstract val price: Double
    abstract val description: String
}

data class Cass(
    override val name: String,
    override val price: Double,
    override val description: String
) : Beer()

data class Cloud(
    override val name: String,
    override val price: Double,
    override val description: String
) : Beer()

data class Beer1(
    override val name: String,
    override val price: Double,
    override val description: String
) : Beer()

data class Beer2(
    override val name: String,
    override val price: Double,
    override val description: String
) : Beer()

data class CreemBeer(
    override val name: String,
    override val price: Double,
    override val description: String
) : Beer()


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

//package com.example.practicekiosk
//
//class Beer {
//    init {
//        beerMenu()
//    }
//
//    data class BeerInfo(val name: String, val price: Double, val description: String)
//
//    fun beerMenu() {
//
//        val beerList = listOf(
//            BeerInfo("Cass", 6.9, "카스"),
//            BeerInfo("Cloud", 8.9, "클라우드"),
//            BeerInfo("beer1", 9.4, "생맥주"),
//            BeerInfo("beer2", 6.9, "죽은맥주"),
//            BeerInfo("beer3", 5.4, "크림맥주"),
//        )
//
//        for (index in beerList.indices) {
//            val beermenu = beerList[index]
//            println("${index + 1}. ${beermenu.name} | W${beermenu.price} | ${beermenu.description}")
//        }
//
//        var beerSelect = readln().toInt()
//
//        when (beerSelect) {
//            1 -> println("Cass를 선택하셨습니다 잠시만 기다려주세요")
//            2 -> println("Cloud를 선택하셨습니다 잠시만 기다려주세요")
//            3 -> println("beer1을 선택하셨습니다 잠시만 기다려주세요")
//            4 -> println("beer2를 선택하셨습니다 잠시만 기다려주세요")
//            5 -> println("beer3를 선택하셨습니다 잠시만 기다려주세요")
//            0 -> return
//        }
//    }
//}