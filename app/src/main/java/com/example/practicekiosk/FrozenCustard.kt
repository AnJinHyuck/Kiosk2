package com.example.practicekiosk

class FrozenCustard {
    init {
        custardMenu()
    }
    data class CustardInfo(val name: String, val price: Double, val description: String)

    fun custardMenu() {
        val custardList = listOf(
            CustardInfo("Vanilla", 6.9, "바닐라 커스타드"),
            CustardInfo("Strawberry", 8.9, "딸기 커스타드"),
            CustardInfo("Blueberry", 9.4, "블루베리 커스타드"),
            CustardInfo("Chocolate", 6.9, "초코 커스타드"),
            CustardInfo("Yogurt ", 5.4, "요거트 커스타드"),
        )

        for (index in custardList.indices) {
            val custardmenu = custardList[index]
            println("${index + 1}. ${custardmenu.name} | W${custardmenu.price} | ${custardmenu.description}")
        }
        var frozenCustardSelect = readln().toInt()

        when (frozenCustardSelect) {
            1 -> println("Vanilla를 선택하셨습니다. 잠시만 기다려주세요.")
            2 -> println("Strawberry를 선택하셨습니다. 잠시만 기다려주세요.")
            3 -> println("Blueberry를 선택하셨습니다. 잠시만 기다려주세요.")
            4 -> println("Chocolate를 선택하셨습니다. 잠시만 기다려주세요.")
            5 -> println("Yogurt를 선택하셨습니다. 잠시만 기다려주세요.")
            0 -> return
        }
    }

}

