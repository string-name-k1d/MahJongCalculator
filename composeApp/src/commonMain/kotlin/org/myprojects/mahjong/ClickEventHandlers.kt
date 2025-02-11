package org.myprojects.mahjong

import org.myprojects.mahjong.Game.Game
import org.myprojects.mahjong.Game.PlayerSeat
import org.myprojects.mahjong.Game.Player.Action

//Should actually be under playerSeat class I dunno wut I was doing
fun onSeatClick(pSeat: PlayerSeat, pGame: Game) {
    //Empty Chair Case
    if (pSeat.isEmpty()) {
        if (pGame.selectedSeat == null){
            val pName: String

            //get name smh
            pName = "John"

            pSeat.player = pGame.registerPlayer(pName)
        } else {
            pGame.selectedSeat!!.swapSeats(pSeat)
            pGame.selectedSeat = null
        }
        return
    }

    //Seated Chair Case
    var action: Action
    //get action
    action = Action.END_GAME

    when (action) {
        Action.SWAP_SEAT -> pGame.selectedSeat = pSeat
        Action.END_GAME -> return   //should do sth like promptRoundEndRegister()
        else -> return              //what ever tf la
    }
}