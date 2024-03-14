package com.example.practicekiosk

class Welcome {
    init {
        welcomeScreen()
    }

    fun welcomeScreen() {
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

                1 -> displayBurgers()
                2 -> displayCustard()
                3 -> displayDrinks()
                4 -> displayBeer()
                0 -> break
            }
        }
    }
}
//    fun displayBurgers() {
//        for (index in burgerlist.indices) {
//            val burgermenu = burgerlist[index]
//            println("${index + 1}. ${burgermenu.name} | W${burgermenu.price} | ${burgermenu.description}")
////        }
//        }
//    }

