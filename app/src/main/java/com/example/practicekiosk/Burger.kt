package com.example.practicekiosk


val burgerlist = listOf(
    ShackBurger("ShakBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
    SmokeShack("SmokeShack", 8.2, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
    ShroomBurger("Shroom Burger", 6.8, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"),
    CheeseBurger("CheeseBurger", 5.8, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
    HamBurger("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
)


abstract class Burger {
    abstract val name: String
    abstract val price: Double
    abstract val description: String
}

data class ShackBurger(
    override val name: String,
    override val price: Double,
    override val description: String
) : Burger()

//    override var name = "ShackBurger"
//    override var price = 6.9
//    override var description = "토마토, 양상추, 쉑소스가 토핑된 치즈버거"
data class SmokeShack(
    override val name: String,
    override val price: Double,
    override val description: String
) : Burger()

//    override var name = "SmokeShack"
//    override var price = 8.9
//    override var description = "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"
data class ShroomBurger(
    override val name: String,
    override val price: Double,
    override val description: String
) : Burger()

//    override var name = "Shroom Burger"
//    override var price = 9.4
//    override var description = "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"
data class CheeseBurger(
    override val name: String,
    override val price: Double,
    override val description: String
) : Burger()

//    override var name = "Cheese Burger"
//    override var price = 6.5
//    override var description = "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"
data class HamBurger(
    override val name: String,
    override val price: Double,
    override val description: String
) : Burger()
//    override var name = "HamBurger"
//    override var price = 5.4
//    override var description = "비프패티를 기반으로 야채가 들어간 기본버거"


//class Burger {
//    init {
//        burgerMenu()
//    }
//
//    data class BurgerInfo(val name: String, val price: Double, val description: String)
//
//    fun burgerMenu() {
//        val burgerList = listOf(
//            BurgerInfo("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
//            BurgerInfo("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
//            BurgerInfo("Shroom Burger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"),
//            BurgerInfo("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
//            BurgerInfo("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"),
//        )
//
//        for (index in burgerList.indices) {
//            val burgermenu = burgerList[index]
//            println("${index + 1}. ${burgermenu.name} | W${burgermenu.price} | ${burgermenu.description}")
//        }
//
//
//        var burgerSelect = readln().toInt()
//
//        when (burgerSelect) {
//            1 -> println("ShackBurger를 선택하셨습니다 잠시만 기다려주세요")
//            2 -> println("SmokeShack를 선택하셨습니다 잠시만 기다려주세요")
//            3 -> println("Shroom Burger를 선택하셨습니다 잠시만 기다려주세요")
//            4 -> println("Cheesburger를 선택하셨습니다 잠시만 기다려주세요")
//            5 -> println("Hamburger를 선택하셨습니다 잠시만 기다려주세요")
//            0 -> return
//        }
//    }
//}


//리스트
//            "[ Burgers MENU ]\n" +
//                  "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
//                    "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
//                    "3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\n" +
//                "4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
//                   "5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
//                  "0. 뒤로가기      | 뒤로가기"