package org.myprojects.mahjong.Game

import org.myprojects.mahjong.Game.Player.Player

class PlayerSeat (pPos: SeatPos){

    val pos: SeatPos = pPos
    var player: Player? = null
        set(pPlayer: Player?) {field = pPlayer!!}

    fun isEmpty(): Boolean {
        return player == null
    }

//    fun setPlayer(pPlayer: Player) {
//        player = pPlayer
//    }

    fun swapSeats(pSeat: PlayerSeat) {
        var temp = pSeat.player
        pSeat.player = this.player
        this.player = temp
    }
}