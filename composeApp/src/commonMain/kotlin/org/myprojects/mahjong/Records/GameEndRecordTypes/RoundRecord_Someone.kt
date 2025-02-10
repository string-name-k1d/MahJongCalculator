package org.myprojects.mahjong.Records.GameEndRecordTypes

import org.myprojects.mahjong.Game.Player.Player

class RoundRecord_Someone(pWinner: Player, pPayer: Player, pScore: Int) : RoundRecord() {
    override val id: Int
    override val endType: GameEndType

    val winner: Player
    val payer: Player
    val score: Int

    init {
        id = ++numRounds
        endType = GameEndType.SOMEONE
        winner = pWinner
        payer = pPayer
        score = pScore
    }
}