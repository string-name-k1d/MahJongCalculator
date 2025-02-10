package org.myprojects.mahjong.Records.GameEndRecordTypes

import org.myprojects.mahjong.Records.Record

abstract class RoundRecord: Record() {
    companion object {
        var numRounds: Int = 0
    }

    abstract val endType: GameEndType
}