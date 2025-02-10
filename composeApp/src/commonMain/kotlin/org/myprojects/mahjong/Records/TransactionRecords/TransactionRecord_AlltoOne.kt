package org.myprojects.mahjong.Records.TransactionRecords

import org.myprojects.mahjong.Game.Player.Player

class TransactionRecord_AlltoOne(pSenders: List<Player>, pReceiver: Player, pReceiveAmount: Int): TransactionRecord() {
    override val id: Int
    override val type: TransactionTypes

    val senders: List<Player>
    val recerver: Player
    val totalAmount: Int
    val eachAmount: Int

    init {
        id = numTransactions++
        type = TransactionTypes.AlltoOne

        senders = pSenders
        recerver = pReceiver
        totalAmount = pReceiveAmount
        eachAmount = pReceiveAmount/3
    }
}