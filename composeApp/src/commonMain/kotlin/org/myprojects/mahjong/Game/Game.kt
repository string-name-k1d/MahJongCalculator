package org.myprojects.mahjong.Game

import org.myprojects.mahjong.MyLinkedList.DLinkedList
import org.myprojects.mahjong.Game.Player.Player
import org.myprojects.mahjong.Records.RecordPage
import org.myprojects.mahjong.Records.GameEndRecordTypes.RoundRecord

class Game {
    var players: MutableList<Player> = mutableListOf<Player>()
    var seats: Array<PlayerSeat> = Array<PlayerSeat>(4, { PlayerSeat(SeatPos.entries[it]) })
    var pastRounds: DLinkedList<RecordPage> = DLinkedList<RecordPage>(RecordPage(4))
    var selectedSeat: PlayerSeat? = null

    fun registerPlayer(pPlayerName: String): Player {
        players.add(Player(pPlayerName))
        return players.last()
    }

    fun registerRound(pRecord: RoundRecord) {
        if (!(pastRounds.tail!!.content.addRecord(pRecord))) {  //record not successfully added
            pastRounds.append(RecordPage(4))
            pastRounds.tail!!.content.addRecord(pRecord)
        }
    }
}