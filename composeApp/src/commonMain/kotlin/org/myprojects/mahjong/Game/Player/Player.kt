package org.myprojects.mahjong.Game.Player

class Player (pName: String){
    companion object {
        var playerCount: Int = 0
    }

    val id: Int
    val name: String
    var balance: Int

    init {
        id = playerCount++
        name = pName
        balance = 0
    }
}