package org.myprojects.mahjong.Records.GameEndRecordTypes

import org.myprojects.mahjong.Game.Player.Player

class RoundRecord_Fake(pFaker: Player, pScore: Int) : RoundRecord() {
    override val id: Int
    override val endType: GameEndType

    val faker: Player
    val score: Int

    init {
        id = ++numRounds
        endType = GameEndType.FAKE
        faker = pFaker
        score = pScore
    }
}