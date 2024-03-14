package com.example.practicekiosk

import android.view.MenuItem

open class Cart {
    val cartItem = mutableListOf<Pair<String, Double>>()
    fun addItem(name: String, price: Double) {
        cartItem.add(Pair(name, price))
    }

    fun showCart() {
        if (cartItem.isEmpty()) {
            println("장바구니가 비어있습니다.")
            return
        }
        println("장바구니 목록")
        cartItem.forEach { (name, price) ->
            println("${name} - ${price}")
        }
        println("계산하시겠습니까?\n" + "1.네    2.아니요 더 쇼핑할게요")
        var checkout = readln().toInt()
        return sum()
    }

    fun sum() {
        val sumOfItem: Double = cartItem.sumOf { it.second }
        println("총액은 ${sumOfItem}입니다.")
    }
}




