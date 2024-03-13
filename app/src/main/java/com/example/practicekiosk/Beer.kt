package com.example.practicekiosk

class Beer {
    init {
        beerMenu()
    }

    data class BeerInfo(val name: String, val price: Double, val description: String)

    fun beerMenu() {

        val beerList = listOf(
            BeerInfo("Cass", 6.9, "카스"),
            BeerInfo("Cloud", 8.9, "클라우드"),
            BeerInfo("beer1", 9.4, "생맥주"),
            BeerInfo("beer2", 6.9, "죽은맥주"),
            BeerInfo("beer3", 5.4, "크림맥주"),
        )

        for (index in beerList.indices) {
            val beermenu = beerList[index]
            println("${index + 1}. ${beermenu.name} | W${beermenu.price} | ${beermenu.description}")
        }

        var beerSelect = readln().toInt()

        when (beerSelect) {
            1 -> println("Cass를 선택하셨습니다 잠시만 기다려주세요")
            2 -> println("Cloud를 선택하셨습니다 잠시만 기다려주세요")
            3 -> println("beer1을 선택하셨습니다 잠시만 기다려주세요")
            4 -> println("beer2를 선택하셨습니다 잠시만 기다려주세요")
            5 -> println("beer3를 선택하셨습니다 잠시만 기다려주세요")
            0 -> return
        }
    }
}