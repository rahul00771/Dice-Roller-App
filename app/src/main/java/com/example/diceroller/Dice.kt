package com.example.diceroller

class Dice(val numsides: Int)
{
    fun roll() : Int
    {
        return((1..numsides).random())
    }
}