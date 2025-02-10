package org.myprojects.mahjong.MyLinkedList

class DLinkedList<T> (pContent: T? = null){

    class DLinkedListNode<T> (pContent: T, pNext: DLinkedListNode<T>? = null, pPrev: DLinkedListNode<T>? = null){
        var content: T = pContent
        var next: DLinkedListNode<T>? = pNext
        var prev: DLinkedListNode<T>? = pPrev
    }

    var size: Int
    var head: DLinkedListNode<T>?
    var tail: DLinkedListNode<T>?

    init {
        if (pContent == null) {
            size = 0
            head = null
            tail = null
        } else {
            size = 1
            head = DLinkedListNode(pContent)
            tail = head
        }
    }

    fun append(pContent: T) {
        if (tail == null) {
            tail = DLinkedListNode<T> (pContent)
            head = tail
        } else {
            tail?.next = DLinkedListNode<T> (pContent, pPrev = tail)
            tail = tail?.next
        }
        ++size
    }
}