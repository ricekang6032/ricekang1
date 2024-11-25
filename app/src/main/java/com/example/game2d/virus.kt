package com.example.game2d

class Virus(val screenW:Int, val screenH:Int, scale:Float) {
    var w = (80 * scale).toInt()
    var h = (80 * scale).toInt()
    var x = screenW
    var y = (screenH/2).toInt()

    var pictNo = 0

    fun Reset(){
        x = screenW
        y = (screenH/2).toInt()
    }
    fun Fly() {
        pictNo++
        if (pictNo > 1) {
            pictNo = 0
        }

        x -= 10
        y += (-20 .. 20).random()
        if((x+w) < 0){
            Reset()
        }
    }

}

