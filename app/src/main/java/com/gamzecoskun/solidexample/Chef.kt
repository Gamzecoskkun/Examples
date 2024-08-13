package com.gamzecoskun.solidexample

/***
 * Created on 13.08.2024
 *@author Gamze Coşkun
 */

fun main(){
    val chef=Chef()
    chef.cook()
    chef.orderIngredients()
    chef.manageStaff()
}

class Chef {

    fun cook(){
        println("Cooking")
    }

    fun orderIngredients(){
        println("Ordering Ingredients")
    }

    fun manageStaff(){
        println("Managing Staff")
    }
}