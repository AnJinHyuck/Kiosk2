package com.example.practicekiosk

import android.view.MenuItem

open class Cart {
    val cartItem = mutableListOf<Pair<String, Double>>()
    val wallet: Double = 100.0
    fun addItem(name: String, price: Double) {
        cartItem.add(Pair(name, price))
    }

    fun showCart(): Double {
        val sumOfItem: Double = cartItem.sumOf { it.second }
        if (cartItem.isEmpty()) {
            println("장바구니가 비어있습니다.")
        }
        println("장바구니 목록")
        cartItem.forEach { (name, price) ->
            println("${name} - ${price}")
        }
        println("총액: ${sumOfItem}")
        println("계산하시겠습니까?      남은 잔액:${wallet}\n" + "1.네    2.아니요 더 쇼핑할게요")
        var checkout = readln().toInt()
        if (checkout == 2) {
            Welcome().welcomeScreen()
        }
        return sum(sumOfItem)
    }

    fun sum(sumOfItem: Double): Double {
        println("잔액은 ${wallet - sumOfItem}입니다.")
        return sumOfItem
    }

}




