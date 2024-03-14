package com.example.practicekiosk

import android.util.Log


fun displayBurgers() {
    while (true) {
        println("Burgers Menu")
        for (index in burgerlist.indices) {
            val burgermenu = burgerlist[index]
            println("${index + 1}. ${burgermenu.name} | W${burgermenu.price} | ${burgermenu.description}")
        }
        println("0. 뒤로가기")
        val burgerSelect = readln().toInt()
        when (burgerSelect) {
            0 -> return
            in 1..burgerlist.size -> {
                selectBurger(burgerSelect)
                return
            }

            else -> println("올바른 값을 입력하세요")
        }
    }
}

fun selectBurger(i: Int) {
    if (i in 0..burgerlist.size) {
        val selected = burgerlist[i - 1]
        println("${selected.name}을 선택하셨습니다.")
    } else {
        println("다시")
    }
}

fun displayCustard() {
    while (true) {
        println("FrozenCustard Menu")
        for (index in custardlist.indices) {
            val custardmenu = custardlist[index]
            println("${index + 1}. ${custardmenu.name} | W${custardmenu.price} | ${custardmenu.description}")
        }
        println("0. 뒤로가기")
        val custardSelect = readln().toInt()
        when (custardSelect) {
            0 -> return
            in 1..custardlist.size -> {
                selectCustard(custardSelect)
                return
            }

            else -> println("올바른 값을 입력하세요")
        }
    }
}

fun selectCustard(i: Int) {
    if (i in 0..custardlist.size) {
        val selected = custardlist[i - 1]
        println("${selected.name}을 선택하셨습니다.")
    } else {
        println("다시")
    }
}


fun displayDrinks() {
    while (true) {
        println("Drinks Menu")
        for (index in drinkslist.indices) {
            val drinksmenu = drinkslist[index]
            println("${index + 1}. ${drinksmenu.name} | W${drinksmenu.price} | ${drinksmenu.description}")
        }
        println("0.뒤로가기")
        val drinksSelect = readln().toInt()
        when (drinksSelect) {
            0 -> return
            in 1..drinkslist.size -> {
                selectDrinks(drinksSelect)
                return
            }

            else -> println("올바른 값을 입력하세요")
        }
    }
}

fun selectDrinks(i: Int) {
    if (i in 0..drinkslist.size) {
        val selected = drinkslist[i - 1]
        println("${selected.name}을 선택하셨습니다.")
    } else {
        println("다시")
    }
}

fun displayBeer() {
    while (true) {
        println("Beer Menu")
        for (index in beerlist.indices) {
            val beermenu = beerlist[index]
            println("${index + 1}. ${beermenu.name} | W${beermenu.price} | ${beermenu.description}")
        }
        println("0.뒤로가기")
        val beerSelect = readln().toInt()
        when (beerSelect) {
            0 -> return
            in 1..beerlist.size -> {
                selectBeer(beerSelect)
                return
            }

            else -> println("올바른 값을 입력하세요")
        }
    }
}

fun selectBeer(i: Int) {
    if (i in 0..beerlist.size) {
        val selected = beerlist[i - 1]
        println("${selected.name}을 선택하셨습니다.")
    } else {
        println("다시")
    }
}

