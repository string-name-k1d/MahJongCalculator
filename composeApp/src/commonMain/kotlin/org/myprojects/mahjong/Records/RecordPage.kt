package org.myprojects.mahjong.Records

import org.myprojects.mahjong.MyLinkedList.DLinkedList

/*
    @param num of records in 1 page
 */
class RecordPage (pSize: Int){
    companion object {
        var numPage: Int = 0
    }

    val id: Int
    var records: Array<Record?>
    var numRecords: Int

    init {
        id = numPage++
        records = arrayOfNulls<Record>(pSize)
        numRecords = 0
    }

    fun addRecord(pRecord: Record): Boolean {
        if (numRecords < records.size) {
            records[numRecords++] = pRecord
            return true
        }
        return false
    }
}