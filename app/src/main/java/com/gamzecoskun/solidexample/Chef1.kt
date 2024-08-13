package com.gamzecoskun.solidexample

/***
 * Created on 13.08.2024
 *@author Gamze Coşkun
 */
fun main() {
    val chef = Chef1()
    chef.cook()

    val manager = Manager()
    manager.orderIngredients()
    manager.manageStaff()
}


class Chef1 {
    fun cook() {
        println("Cooking")
    }
}

class Manager {
    fun orderIngredients() {
        println("Ordering Ingredients")
    }

    fun manageStaff() {
        println("Managing Staff")
    }
}