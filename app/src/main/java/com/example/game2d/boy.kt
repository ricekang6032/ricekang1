package com.example.game2d
import android.graphics.Rect

class Boy(screenH:Int, scale:Float) {
    var w = (100 * scale).toInt()  //小男孩寬度
    var h = (220 * scale).toInt()  //小男孩高度
    var x = 0  //小男孩x軸座標
    var y = screenH - h
    var pictNo = 0  //切換圖片
    var zoomout = (10 * scale).toInt()

    fun Walk() {
        pictNo++
        if (pictNo > 7) {
            pictNo = 0
        }
    }
    fun getRect(): Rect {
        return Rect(x+zoomout, y+zoomout,x+w-zoomout, y+h-zoomout)
    }

}
