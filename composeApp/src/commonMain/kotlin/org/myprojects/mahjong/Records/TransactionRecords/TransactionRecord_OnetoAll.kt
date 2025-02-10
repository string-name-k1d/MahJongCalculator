package org.myprojects.mahjong.Records.TransactionRecords

import org.myprojects.mahjong.Game.Player.Player

class TransactionRecord_OnetoAll(pSender: Player, pReceivers: List<Player>, pSendAmount: Int): TransactionRecord() {
    override val id: Int
    override val type: TransactionTypes

    val sender: Player
    val recervers: List<Player>
    val totalAmount: Int
    val eachAmount: Int

    init {
        id = numTransactions++
        type = TransactionTypes.OnetoAll

        sender = pSender
        recervers = pReceivers
        totalAmount = pSendAmount
        eachAmount = pSendAmount/3
    }
}