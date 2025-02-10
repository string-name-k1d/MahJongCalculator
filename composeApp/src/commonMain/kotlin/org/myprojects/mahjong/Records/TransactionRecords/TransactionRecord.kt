package org.myprojects.mahjong.Records.TransactionRecords

import org.myprojects.mahjong.Records.Record

abstract class TransactionRecord: Record() {
    companion object {
        var numTransactions: Int = 0
    }

    abstract override val id: Int
    abstract val type:TransactionTypes
}