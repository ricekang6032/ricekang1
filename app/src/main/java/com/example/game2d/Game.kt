package com.example.game2d

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class Game(val scope: CoroutineScope, screenW:Int, val screenH: Int,scale:Float) {
    var counter = 0
    val state = MutableStateFlow(0)
    val background = Background(screenW)
    val boy = Boy(screenH, scale)
    val virus = Virus(screenW, screenH, scale)
    var isPlaying = true
    fun Play(){
        scope.launch {
            //counter = 0
            isPlaying = true
            while (isPlaying) {
                delay(4)
                background.Roll()
                if (counter % 3 == 0){
                    boy.Walk()
                    virus.Fly()
                }
                counter++
                state.emit(counter)
            }
        }
    }
}



