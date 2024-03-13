package com.example.practicekiosk

class MainScreen {
}

fun main() {
    println(mainScreen())
}

fun mainScreen() {
    while (true) {
        println(
            "[ SHAKESHACK MENU ]\n" +
                    "1. Burgers         | 버거\n" +
                    "2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
                    "3. Drinks          | 음료\n" +
                    "4. Beer            | 맥주\n" +
                    "0. 종료            | 프로그램 종료"
        )
        println("원하는 메뉴를 선택하세요")

        var selectMenu = readln().toInt()

        when (selectMenu) {

            1 -> Burger()
            2 -> FrozenCustard()
            3 -> Drinks()
            4 -> Beer()
            0 -> break
        }
    }
}