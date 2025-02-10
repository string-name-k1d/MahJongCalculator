package org.myprojects.mahjong.Records.TransactionRecords

import org.myprojects.mahjong.Game.Player.Player

class TransactionRecord_OnetoOne(pSender: Player, pReceiver: Player, pAmount: Int): TransactionRecord() {
    override val id: Int
    override val type: TransactionTypes

    val sender: Player
    val recerver: Player
    val amount: Int

    init {
        id = numTransactions++
        type = TransactionTypes.OnetoOne

        sender = pSender
        recerver = pReceiver
        amount = pAmount
    }
}