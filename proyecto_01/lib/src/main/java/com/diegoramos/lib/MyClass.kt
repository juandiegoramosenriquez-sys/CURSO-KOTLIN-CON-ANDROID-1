package com.diegoramos.lib

fun main() {
    println("Edad")
    val edad = readln().toIntOrNull() ?: "Pon un número, no otra cosa"

    println("Hola, tienes $edad años")
}