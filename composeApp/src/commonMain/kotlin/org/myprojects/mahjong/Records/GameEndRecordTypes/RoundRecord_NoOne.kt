package org.myprojects.mahjong.Records.GameEndRecordTypes

class RoundRecord_NoOne() : RoundRecord() {
    override val id: Int
    override val endType: GameEndType

    init {
        id = ++numRounds
        endType = GameEndType.NO_ONE
    }
}