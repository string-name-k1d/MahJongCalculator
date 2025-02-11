package org.myprojects.mahjong.Game

class GameSettings (pNumRounds: Int = 4, pMin: Int, pMax: Int, pBaseScore: Int = 2, pMode: Boolean = false){
    var numRounds: Int
    var minFan: Int
    var maxFan: Int                     //0 for not exist
    var scoreMode: Boolean              //player score doubles every fan (true) or every 2 fan (false)
    var scoreMap: MutableMap<Int, Int>  //fan(round score) -> player score

    init {
        numRounds = pNumRounds
        minFan = pMin
        maxFan = pMax
        scoreMode = pMode
        if (pMode) {
            scoreMap = mutableMapOf<Int, Int>(
                pMin to pBaseScore,
                // This is problematic cus I dunno Kotlin syntax, but u get the gist
                for (fan in pMin + 1 .. pMax)
                    fan to (pBaseScore *= 2)
            )
        } else {
            scoreMap = mutableMapOf<Int, Int>()
        }
    }
}