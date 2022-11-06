package com.c4.basics.creations

data class Owner(
    val name: String,
    val phone: Long,
    val address: String
) : Person() {
    override fun talk() {
    }
}
