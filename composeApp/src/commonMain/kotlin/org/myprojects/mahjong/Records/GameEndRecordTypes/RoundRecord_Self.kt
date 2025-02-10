package org.myprojects.mahjong.Records.GameEndRecordTypes

import org.myprojects.mahjong.Game.Player.Player

class RoundRecord_Self(pWinner: Player, pScore: Int) : RoundRecord() {
    override val id: Int
    override val endType: GameEndType

    val winner: Player
    val score: Int

    init {
        id = ++numRounds
        endType = GameEndType.SELF
        winner = pWinner
        score = pScore
    }
}